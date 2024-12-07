/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author P51
 */
/*
Cho số nguyên dương N có thể rất lớn nhưng không quá 500 chữ số. Xét các vị trí từ trái qua phải (tính từ 0). Hãy tính:

Tích các chữ số ở vị trí chẵn – giá trị tích chữ số có thể đến 18 chữ số. Chú ý khi tính tích bỏ qua các chữ số 0.
Tổng các chữ số ở vị trí lẻ
 

Input

Dòng đầu ghi số bộ test (không quá 20)
Mỗi bộ test ghi trên một dòng số nguyên dương N (ít nhất 2 chữ số và không quá 500 chữ số)
Output

Với mỗi bộ test, viết trên một dòng hai giá trị: tích chữ số và tổng chữ số tính được.

Ví dụ

Input



3

12345678

20000

22334455667788
Output
105 20

2 0

40320 35
*/
import  java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            long product = 1;
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (i % 2 == 0) {
                    if (c != '0') {
                        product *= Integer.valueOf(String.valueOf(c));
                    }
                } else {
                    sum += Integer.valueOf(String.valueOf(c));
                }
            }
            System.out.println("" + product + " " + sum);
        }
    }
}
