/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai59;

/**
 *
 * @author P51
 */
/*
Khoa CNTT tổ chức báo cáo thực tập cho sinh viên năm cuối. Ngày báo cáo đã được xác định trước, các sinh viên sẽ được báo cáo vào các khung giờ khác nhau.

Danh sách đề tài thực tập đã được lưu trong file văn bản BAITAP.in trong đó ghi thông tin về đề tài thực tập, mỗi đề tài gồm 3 dòng lần lượt là:

Mã sinh viên: dạng xâu ký tự, không quá 10 ký tự
Họ và tên: không quá 30 ký tự
Tên đề tài: không quá 200 ký tự
Lịch báo cáo được thể hiện trong file văn bản BAOCAO.in trong đó mỗi sinh viên sẽ ghi trên 2 dòng:

Mã sinh viên
Thời gian báo cáo theo định dạng hh:mm trong đó hh ghi giá trị giờ (định dạng 24h); mm là giá trị phút. Ví dụ: 08:40, không trùng nhau
Hãy in ra màn hình thứ tự báo cáo, chia làm 2 ca sáng và chiều (ca sáng kết thúc trước12h trưa, ca chiều tính từ 12h, cùng số lượng sinh viên báo cáo) mỗi dòng ghi đủ các thông tin: mã sinh viên, họ tên, tên đề tài và thời gian báo cáo, do đã chia ra 2 ca nên thời gian ca chiều đổi về định dạng 12h cho dễ theo dõi. Các thông tin cách nhau bởi khoảng trống.

Test ví dụ

BAITAP.in

B19DCCN123

Tran Van An

Tim hieu dien toan dam may

B19DCCN987

Hoang Van Binh

Xay dung game nhap vai

B20DCCN222

Nguyen Van Huy

Xay dung web ban hang

BAOCAO.in

B19DCCN123

13:45

B19DCCN987

07:30

B20DCCN222

08:00

Output

DANH SACH SINH VIEN BAO CAO CA SANG: 2

B19DCCN987 Hoang Van Binh Xay dung game nhap vai 07:30

B20DCCN222 Nguyen Van Huy Xay dung web ban hang 08:00

 

DANH SACH SINH VIEN BAO CAO CA CHIEU: 1

B19DCCN123 Tran Van An Tim hieu dien toan dam may 01:45


*/
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Bai59 {
    public static void main(String[] args) throws ParseException, IOException{
//        Scanner input1 = new Scanner(new File("src/file_storing/bai59/BAOCAO.in"));
//        Scanner input2 = new Scanner(new File("src/file_storing/bai59/BAITAP.in"));
        Scanner input1 = new Scanner(new File("BAOCAO.in"));
        Scanner input2 = new Scanner(new File("BAITAP.in"));
        ArrayList<Report> reports = new ArrayList<>();
        while (input1.hasNextLine()) {
            reports.add(new Report(input1.nextLine().trim(), input1.nextLine().trim()));
        }
        ArrayList<Assignment> morningAssignments = new ArrayList<>();
        ArrayList<Assignment> afternoonAssignments = new ArrayList<>();
        while (input2.hasNextLine()) {
            String id = input2.nextLine().trim();
            Report a = null;
            for (Report x : reports) {
                if (x.getId().equals(id)) {
                    a = x;
                    break;
                }
            }
            Assignment b = new Assignment(input2.nextLine().trim(), input2.nextLine().trim(), a);
            if (b.getReport().isIsMorning() == true) {
                morningAssignments.add(b);
            } else {
                afternoonAssignments.add(b);
            }

            
        }
        System.out.println("DANH SACH SINH VIEN BAO CAO CA SANG: " + morningAssignments.size());
        for (Assignment x : morningAssignments) {
            System.out.println(x);
        }
        System.out.println();
        System.out.println("DANH SACH SINH VIEN BAO CAO CA CHIEU: " + afternoonAssignments.size());
        for (Assignment x : afternoonAssignments) {
            System.out.println(x);
        }
        
    }
}
