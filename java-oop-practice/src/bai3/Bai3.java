/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author P51
 */
/*
Cho số nguyên dương N. Hãy đưa ra ước số nguyên tố lớn nhất của N.

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test ghi số nguyên dương N.
T, N thỏa mãn ràng buộc: 1≤T≤100; 2≤N≤1010.
Output:

Đưa ra kết quả mỗi test theo từng dòng.
      Ví dụ:

 

Input:



2

315

31
Output:
7

31
*/
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            long x = input.nextLong();
            long res = 1;
            for (int i = 2; i * i <= x; i++) {
                while (x % i == 0) {
                    x /= i;
                    res = i;
                }
            }
            if (x > 1) {
                System.out.println(x);
            } else {
                System.out.println(res);
            }
        }
    }
}
