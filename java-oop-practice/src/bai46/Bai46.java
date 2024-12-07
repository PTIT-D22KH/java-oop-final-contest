/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai46;

/**
 *
 * @author P51
 */
/*
Giá trị độ đo thời gian được biểu diễn bởi ba thành phần: giờ, phút, giây.

Cho N giá trị thời gian, hãy sắp xếp danh sách theo thứ tự tăng dần.

Input

Dòng đầu ghi số nguyên dương N (không quá 5000) là số lượng giá trị thời gian cần sắp xếp.

Mỗi giá trị thời gian biểu diễn trên một dòng bằng ba số nguyên dương, lần lượt là số giờ, số phút, số giây. Trong đó số giờ đảm bảo nhỏ hơn 100, số phút và số giây đảm bảo đúng quy tắc (tức là không quá 59).

Output

In ra danh sách đã sắp xếp theo thứ tự tăng dần.

Ví dụ

Input

Output

3

11 20 20

14 20 14

11 15 12

11 15 12

11 20 20

14 20 14
*/
import java.text.ParseException;
import java.util.*;
public class Bai46 {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Timer> timers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            timers.add(new Timer(input.nextInt(), input.nextInt(), input.nextInt()));
        }
        Collections.sort(timers);
        for (Timer x : timers) {
            System.out.println(x);
        }
    }
}
