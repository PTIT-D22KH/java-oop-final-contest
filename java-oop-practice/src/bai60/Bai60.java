/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai60;

/**
 *
 * @author P51
 */
/*
Cho hai file nhị phân DATA1.in và DATA2.in, mỗi file ghi một danh sách các số nguyên dương ở dạng ArrayList<Integer> và ghi theo kiểu Object. Các giá trị số đảm bảo không quá 10000 và mỗi list không quá 100000 số.

Hãy liệt kê các số nguyên tố xuất hiện trong cả hai file cùng với số lần xuất hiện ở từng file.

Input

Hai file nhị phân DATA1.in và DATA2.in theo mô tả ở trên.

Output

Ghi lần lượt các số nguyên tố xuất hiện trong cả hai file theo thứ tự từ nhỏ đến lớn, mỗi số trên một dòng kèm theo số lần xuất hiện trong file DATA1.in sau đó đến số lần xuất hiện trong DATA2.in

Ví dụ

Input



Hai file nhị phân theo mô tả đề bài.

 

Liệt kê các số nguyên tố xuất hiện trong cả hai file và số lần trong DATA1.in và DATA2.in

 

Ví dụ:

 Output

13 7 5

23 18 2

97 11 5
*/
import java.util.*;
import java.io.*;
public class Bai60 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> a = (ArrayList<Integer>)input1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>)input2.readObject();
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(7);
//        a.add(5);
//        a.add(5);
//        ArrayList<Integer> b = new ArrayList<>();
//        b.add(2);
//        b.add(7);
//        b.add(5);
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int x : a) {
            if (isPrime(x)) {
                if (mp1.containsKey(x)) {
                    mp1.put(x, mp1.get(x) + 1);
                } else {
                    mp1.put(x, 1);
                }
                ts.add(x);
            }
        }
        for (int x : b) {
            if (isPrime(x)) {
                if (mp2.containsKey(x)) {
                    mp2.put(x, mp2.get(x) + 1);
                } else {
                    mp2.put(x, 1);
                }
                ts.add(x);
            }
        }
        for (int x : ts) {
            if (mp1.containsKey(x) && mp2.containsKey(x)) {
                System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
            }
            
        }
                
    }
    private static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        } 
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
