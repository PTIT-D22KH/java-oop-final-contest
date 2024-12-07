/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author P51
 */
/*
Cho file nhị phân DAYSO.DAT trong đó ghi một ArrayList<Integer> theo kiểu Object. Hãy thống kê các số nguyên tố khác nhau có từ 3 chữ số trở lên và liệt kê theo thứ tự từ nhỏ đến lớn.

Input

File nhị phân DAYSO.DAT trong đó ghi một ArrayList<Integer>.

Dữ liệu đảm bảo trong ArrayList có không quá 100000 đối tượng số Integer. Các giá trị số cũng đều không quá 1000000.

Output

Ghi lần lượt các số nguyên tố khác nhau có từ 3 chữ số trở lên theo thứ tự từ nhỏ đến lớn, mỗi số ghi trên một dòng.

Ví dụ

Input



File nhị phân như mô tả đề bài.
Output
Ví dụ kết quả sẽ như sau

113

163

229

887

907
*/
import java.util.*;
import java.io.*;
public class Bai18 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> a = (ArrayList<Integer>)input.readObject();
        Collections.sort(a);
        TreeSet<Integer> ts = new TreeSet<>(a);
        for (int x : ts) {
            if(isPrime(x)) {
                System.out.println(x);
            }
            
        }
        
    } 
    private static boolean isPrime(int x) {
        if (x < 100) {
            return false;
        }
        for (int i = 2; i * i <= x; i++ ){
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
