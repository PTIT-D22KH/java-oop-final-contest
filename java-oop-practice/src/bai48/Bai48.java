/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai48;

/**
 *
 * @author P51
 */
/*
Cho hai file nhị phân DATA1.in và DATA2.in, mỗi file đều chứa một ArrayList<Integer>. Dữ liệu đảm bảo có không quá 100000 số trong mỗi file, và các số đều nguyên dương, không quá 4 chữ số.

Một số nguyên dương có từ 2 chữ số trở lên được gọi là không giảm nếu các chữ số từ trái sang phải của nó thỏa mãn không có chữ số đằng sau nào lại nhỏ hơn chữ số phía trước nó. Ví dụ: 899, 1134; 7778.

Hãy liệt kê các số không giảm xuất hiện trong cả hai file DATA1.in và DATA2.in, các số cần liệt kê theo thứ tự tăng dần và kèm theo số lần xuất hiện trong lần lượt từng file.

Input

Hai file nhị phân DATA1.in và DATA2.in

Output

Ghi lần lượt từng số thỏa mãn theo thứ tự tăng dần, tiếp theo là số lần xuất hiện trong file 1 rồi đến file 2.

Ví dụ

Input



Hai file nhị phân

Lần lượt các số thỏa mãn và số lần tương ứng. Ví dụ:
Output
59 1 19

66 6 12

1228 9 10
*/
import java.util.*;
import java.io.*;
public class Bai48 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> a = (ArrayList<Integer>)(input1.readObject());
        ArrayList<Integer> b = (ArrayList<Integer>)(input2.readObject());
        
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for (int x : a) {
            if (isNumber(x)) {
                if (mp1.containsKey(x)) {
                    mp1.put(x, mp1.get(x) + 1);
                } else {
                    mp1.put(x, 1);
                }
                ts.add(x);
            }
        }
        for (int x : b) {
            if (isNumber(x)) {
                if (mp2.containsKey(x)) {
                    mp2.put(x, mp2.get(x) + 1);
                } else {
                    mp2.put(x, 1);
                }
                ts.add(x);
            }
        }
        for (int x : ts) {
            if (mp1.containsKey(x) && mp2.containsKey(x)) {
                System.out.println(x + " " + mp1.get(x) + " " + mp2.get(x));
            }
            
        }
    }
    private static boolean isNumber(int x) {
        if (x < 10) {
            return false;
        }
        int y = x;
        int t = y % 10;
        while (y > 0) {
            int digit = y % 10;
            if (digit > t) {
                return false;
            }
            t = digit;
            y /= 10;
            
        }
        return true;
    }
}
