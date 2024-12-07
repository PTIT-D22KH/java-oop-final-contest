/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai34;

/**
 *
 * @author P51
 */
/*
Với danh sách liên lạc của sinh viên đã có trong bài DANH SÁCH LIÊN LẠC, văn phòng Khoa CNTT1 lập danh sách hướng dẫn đồ án tốt nghiệp. Trong đó mỗi giảng viên sẽ cho biết số sinh viên mình hướng dẫn, sau đó lần lượt là mã sinh viên rồi đến tên đồ án.

Hãy lập danh sách các đồ án tốt nghiệp trong đó ghi rõ mã sinh viên, tên sinh viên, tên giảng viên, tên đồ án tốt nghiệp, số điện thoại liên lạc.

Input – 2 file văn bản

File DANHSACH.in

Không có số lượng sinh viên. Nhưng biết mỗi sinh viên ghi trên 5 dòng gồm:

Mã sinh viên
Họ tên
Lớp
Email
Số điện thoại (thiếu chữ số 0 ở đầu).
File HUONGDAN.in

Dòng đầu ghi số giảng viên tham gia hướng dẫn. Với mỗi giảng viên:

Dòng đầu ghi tên giảng viên, sau đó đến 1 số nguyên N (ở cuối dòng) cho biết số đồ án hướng dẫn (trong phạm vi từ 1 đến 7).
Tiếp theo là N dòng, mỗi dòng ghi mã sinh viên, sau đó đến tên đồ án (tên có thể dài đến 200 ký tự).
Output

Ghi ra danh sách các đồ án đã sắp xếp theo mã sinh viên (thứ tự từ điển). Các thông tin cần liệt kê gồm:

Mã sinh viên
Tên sinh viên
Tên giảng viên hướng dẫn
Tên đồ án
Số điện thoại
Các thông tin cách nhau 1 khoảng trống.

Ví dụ

Input – DANHSACH.in

B21DCCN123

Tran Van Toan

D21CQCN01-B

toantv@gmail.com

987654321

B21DCCN111

Ly Van Binh

D21CQCN01-B

binhlv@gmail.com

978652142

B21DCAT661

Hoang Tam Anh

D21CQAT01-B

anhht@gmail.com

966554321

Input – HUONGDAN.in

2

Tran Van Nam 2

B21DCCN111 Phat trien ung dung TMDT

B21DCAT661 Xay dung ung dung quan ly ban hang

Duong Tuan Anh 1

B21DCCN123 Xay dung game nhap vai voi Unity 3D

 

 

Output – in ra màn hình

B21DCAT661 Hoang Tam Anh Tran Van Nam Xay dung ung dung quan ly ban hang 0966554321

B21DCCN111 Ly Van Binh Tran Van Nam Phat trien ung dung TMDT 0978652142

B21DCCN123 Tran Van Toan Duong Tuan Anh Xay dung game nhap vai voi Unity 3D 0987654321
*/
import java.util.*;
import java.io.*;
public class Bai34 {
    public static void main(String[] args) throws IOException{
//        Scanner input1 = new Scanner(new File("src/file_storing/bai34/DANHSACH.in"));
//        Scanner input2 = new Scanner(new File("src/file_storing/bai34/HUONGDAN.in"));
        Scanner input1 = new Scanner(new File("DANHSACH.in"));
        Scanner input2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<Student> students = new ArrayList<>();
        while (input1.hasNextLine()) {
            students.add(new Student(input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine(), input1.nextLine()));
        }
        int n = Integer.parseInt(input2.nextLine());
        while (n-- > 0) {
            String s = input2.nextLine().trim();
            String a[] = s.split("\\s+");
            int m = Integer.parseInt(a[a.length - 1]);
            StringBuilder name = new StringBuilder();
            for (int i = 0; i < a.length - 1; i++) {
                name.append(a[i]).append(" ");
            }
            while(m-- > 0) {
                String s1 = input2.nextLine().trim();
                a = s1.trim().split("\\s+");
                String studentId = a[0];
                StringBuilder res = new StringBuilder();
                for (int i = 1; i < a.length; i++) {
                    res.append(a[i]).append(" ");
                }
                Instructor instructor = new Instructor(name.toString().trim(), res.toString().trim());
                for (Student x : students) {
                    if (x.getId().equals(studentId)) {
                        x.setInstructor(instructor);
                        break;
                    }
                }
            }
        }
        Collections.sort(students);
        for(Student x : students) {
            System.out.println(x);
        }
    }
}