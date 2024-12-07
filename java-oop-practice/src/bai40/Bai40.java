/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai40;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân DATA.in có một ArrayList<Integer>, giá trị các số đều lớn hơn hoặc bằng 0 và nhỏ hơn 1000. Có không quá 106 số trong danh sách. 

Hãy liệt kê các số khác nhau xuất hiện trong file và số lần xuất hiện của từng số đó.

Input

File DATA.in lưu một ArrayList<Integer> theo kiểu Object.

Output

Ghi ra các số khác nhau và số lần xuất hiện theo thứ tự tăng dần

Ví dụ:

DATA.in



File nhị phân theo mô tả đề bài

Liệt kê các số tăng dần. Ví dụ:
Output
10 2

23 1

24 1

25 4
*/
import java.util.*;
import java.io.*;
public class Bai40 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        HashMap<Integer, Integer> mp = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int x : a) {
            ts.add(x);
            if (mp.containsKey(x)) {
                mp.put(x, mp.get(x) + 1);
            } else {
                mp.put(x, 1);
            }
        }
        for (int x : ts) {
            System.out.println(x + " " + mp.get(x));
        }
    }
}
