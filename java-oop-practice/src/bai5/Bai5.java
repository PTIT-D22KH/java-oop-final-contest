/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author P51
 */
/*
Cho xâu ký tự S. Nhiệm vụ của bạn là đảo ngược các từ trong S. Ví dụ S =  “I like this program very much”, ta nhận được kết quả là “much very program this like I”.

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test là một xâu ký tự S.
T, S thỏa mãn ràng buộc: 1≤ T ≤100; 1≤ Length(S)≤103.
Output:

Đưa ra kết quả mỗi test theo từng dòng.
Ví dụ:

Input:



2
I like this program very much

much very program this like I
Output:
much very program this like I
I like this program very much
*/
import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0 ) {
            String s = input.nextLine();
            Stack<String> st = new Stack<>();
            String a[] = s.trim().split("\\s+");
            for (String x : a) {
                st.push(x);
            }
            while(!st.empty()) {
                System.out.print(st.pop() + " ");
            }
            System.out.println();
        }
    }
}
