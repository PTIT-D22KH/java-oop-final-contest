/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai31;

/**
 *
 * @author P51
 */
/*
Cho một đa giác lồi có N đỉnh trên mặt phẳng Oxy.

Nhiệm vụ của bạn là hãy tính diện tích đa giác này.

Yêu cầu hướng đối tượng: Khai báo lớp Polygon và mô tả các phương thức phù hợp cho hàm main có sẵn. 

 

Input - file văn bản POLYGON.in:

Dòng đầu tiên là số lượng bộ test T (T ≤ 100).

Mỗi test bắt đầu bởi số nguyên N (N ≤ 1000).

N dòng tiếp theo, mỗi dòng gồm 2 số nguyên x[i], y[i] (-1000 ≤ x[i], y[i] ≤ 1000) là tọa độ của điểm thứ i. Các điểm được liệt kê theo thứ tự ngược chiều quay kim đồng hồ.

Output: 

Với mỗi test, in ra đáp án tìm được trên một dòng, kết quả được ghi với đúng 3 chữ số phần thập phân. 

Ví dụ:

POLYGON.in

Output

2

3

0 0

1 0

0 1

4

0 0

2 0

2 2

0 2

 

0.500

4.000

 

Time limit: 2s

Memory limit: 200000 Kb

This problem requires the use of the main function given below:

Java
public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            Point p[] = new Point[n];
            for(int i = 0; i < n; i++){
                p[i] = new Point(in.nextInt(),in.nextInt());
            }
            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
*/
public class Bai31 {
    
}
