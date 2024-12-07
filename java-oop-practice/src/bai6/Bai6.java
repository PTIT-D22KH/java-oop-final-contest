/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author P51
 */
/*
Khi viết tên người Việt Nam sang dạng chuẩn Tiếng Anh không dấu, người ta có thể lựa chọn 1 trong 2 cách viết:

Cách 1: tên có 1 từ.
Ví dụ: Nguyen Manh Son được viết thành Son Nguyen Manh

Cách 2: họ có 1 từ.
Ví dụ: Nguyen Manh Son được viết thành Manh Son Nguyen

Hãy viết chương trình chuẩn hóa xâu ký tự họ tên theo một trong hai dạng trên.

Input

Dòng đầu ghi số bộ test.

Mỗi bộ test gồm 2 dòng. Dòng đầu ghi số 1 hoặc số 2 cho biết cách chuẩn hóa được chọn. Dòng thứ 2 ghi xâu họ tên có độ dài không quá 60 ký tự.

Output

Ghi ra danh sách các xâu họ tên đã chuẩn hóa.

Chú ý: có thể phải loại bỏ khoảng trống, chuyển đổi chữ hoa chữ thường cho đúng với cách viết họ tên chuẩn trước khi áp dụng một trong hai cách viết nói trên.

Ví dụ

Input


2

1

NguyeN    vAn    Nam

2

hoAng  le Nhat THONG chi

Output
Nam Nguyen Van

Le Nhat Thong Chi Hoang
*/
import java.util.*;
public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = Integer.parseInt(input.nextLine());
        while (t-- > 0) {
            String type = input.nextLine();
            String s = input.nextLine();
            System.out.println(toEnglish(s, type));
        }
    }
    private static String toEnglish(String s, String type) {
        String res = "";
        if (type.equals("1")) {
            String a[] = s.trim().split("\\s+");
            StringBuilder temp = new StringBuilder();
            String name = normalizeName(a[a.length - 1]);
            for (int i = 0; i < a.length - 1; i++) {
                temp.append(normalizeName(a[i])).append(" ");
            }
            res = name + " " + temp.toString().trim();
        } else {
            String a[] = s.trim().split("\\s+");
            StringBuilder temp = new StringBuilder();
            String lastName = new String();
            lastName = normalizeName(a[0]);
            for (int i = 1; i < a.length; i++) {
                temp.append(normalizeName(a[i])).append(" ");
            }
            res = temp.toString().trim() + " " + lastName;
        }
        return res;
    }
    private static String normalizeName(String s) {
        String x = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        res.append(Character.toUpperCase(x.charAt(0)));
        for (int i = 1; i < x.length(); i++) {
            res.append(x.charAt(i));
        }
        return res.toString();
    }
}
