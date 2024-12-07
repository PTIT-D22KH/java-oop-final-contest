/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai30;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân DATA.in trong đó ghi một ArrayList<String> theo kiểu Object.

Mỗi String trong danh sách là một dòng văn bản có thể có cả các ký tự số hoặc chữ cái. Mỗi dãy liên tiếp các ký tự không chứa khoảng trống hoặc dấu xuống dòng được gọi là một từ.

Viết chương trình lọc ra các giá trị số int khác nhau trong tập từ của file và liệt kê ra màn hình theo thứ tự từ nhỏ đến lớn.

Input

File nhị phân DATA.in như mô tả.

Output

Ghi ra màn hình lần lượt các giá trị số int khác nhau tìm được theo thứ tự từ nhỏ đến lớn.

Ví dụ

DATA.in



File nhị phân như mô tả.

Ví dụ các dòng văn bản trong dữ liệu có thể như sau:

 

Java Programming 5 has 371 pages.

More than 70 % …
Output
5

70

371
*/
import java.util.*;
import java.io.*;
public class Bai30 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)input.readObject();
        TreeSet<Integer> ts = new TreeSet<>();
        for (String x : a) {
            String b[] = x.trim().split("\\s+");
            for (String y : b) {
                try {
                    int n = Integer.parseInt(y);
                    ts.add(n);
                } catch (Exception e) {
                }
            }
        }
        for (int x : ts) {
            System.out.println(x);
        }
    }  
}
