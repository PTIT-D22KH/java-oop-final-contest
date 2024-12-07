/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author P51
 */
/*
Cho xâu ký tự S bao gồm các ký tự ‘A’,..,’Z’ và các chữ số ‘0’,...,’9’. Nhiệm vụ của bạn in các ký tự từ ’A’,.., ‘Z’ trong S theo thứ tự từ điển và nối với tổng các chữ số trong S ở cuối cùng. Ví dụ S =”ACCBA10D2EW30” ta nhận được kết quả: “AABCCDEW6”.

Input:

Dòng đầu tiên đưa vào số lượng bộ test T.
Những dòng kế tiếp đưa vào T bộ test. Mỗi bộ test là một xâu ký tự S.
T, S thỏa mãn ràng buộc: 1≤ T ≤100; 1≤ Length(S)≤105.
Output:

Đưa ra kết quả mỗi test theo từng dòng.
 Ví dụ:

Input:


2
AC2BEW3
ACCBA10D2EW30
Output:

ABCEW5
AABCCDEW6
*/
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            System.out.println(transformString(s));
        }
    }
    private static String transformString(String s) {
        ArrayList<Character> ts = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                ts.add(c);
            } else {
                sum += Integer.parseInt(String.valueOf(c));
            }
            
        }
        Collections.sort(ts);
        String res = "";
        for (Character x : ts) {
            res += x;
        }
        res += String.valueOf(sum);
        return res;
        
    }
}
