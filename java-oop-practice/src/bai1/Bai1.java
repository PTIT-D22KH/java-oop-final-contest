/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

/**
 *
 * @author P51
 */
/*
Cho dữ liệu dạng luồng văn bản với không quá 1 triệu từ, mỗi từ không quá 100 ký tự. Hãy tìm và in ra từ dài nhất.

Nếu có nhiều từ dài nhất thì in ra từ đầu tiên.

Input

Luồng văn bản. Cần đọc đến hết luồng vào.

Output

Ghi ra từ dài nhất đầu tiên, dấu gạch ngang, sau đó đến độ dài.

Ví dụ

Input



Lap trinh C++

Cau truc du lieu va giai do
Output
trinh - 5
*/
import java.util.*;
import java.io.*;
public class Bai1 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
//        Scanner input = new Scanner(new File("src/file_storing/bai1/DATA.in"));
        String res = new String();
        int maxLength = 0;
        while(input.hasNextLine()) {
            String s = input.nextLine();
            String a[] = s.trim().split("\\s+");
            for (String x : a) {
                int l = x.length();
                if (l > maxLength) {
                    maxLength = l;
                    res = x;
                }
            }
        }
        System.out.println(res + " - " + maxLength);
    }
}
