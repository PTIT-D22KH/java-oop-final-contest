/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai39;

/**
 *
 * @author P51
 */
/*
Cho file dữ liệu dạng văn bản DATA.in có thể chứa cả số và ký tự.

Hãy lọc ra các số nguyên int trong file và tính tổng các số đó.

Chú ý: file dữ liệu có rất nhiều dòng với rất nhiều số và ký tự xen kẽ nhau. Chỉ tính tổng các số thỏa mãn điều kiện là số kiểu int.

Input

File văn bản DATA.in có không quá 1000 dòng.

Output

Ghi ra giá trị tổng các số tính được.

Ví dụ

DATA.in



12 3 4 5 6 7

Aaa 1 1 Bbb XXX yyy 5 5

999999999999999999999999

9
Output
58
*/
import java.util.*;
import java.io.*;
public class Bai39 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_storing/bai39/DATA.in"));
        Scanner input = new Scanner(new File("DATA.in"));
        int sum = 0;
        while (input.hasNextLine()) {
            String s = input.nextLine().trim();
            String a[] = s.split("\\s+");
            for (String x : a) {
                try {
                    int b = Integer.parseInt(x);
                    sum += b;
                } catch (NumberFormatException e) {
                }
            }
        }
        System.out.println(sum);
    }
}
