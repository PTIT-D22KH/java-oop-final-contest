/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai19;

/**
 *
 * @author P51
 */
/*
Địa chỉ email của các cán bộ, giảng viên PTIT được tạo ra bằng cách viết đầy đủ tên và ghép với các chữ cái đầu của họ và tên đệm. Nếu có nhiều người cùng email thì từ người thứ 2 sẽ thêm số thứ tự vào email đó.

Cho trước các xâu họ tên (có thể không chuẩn). Hãy tạo ra các địa email tương ứng. Chú ý, do lỗi soạn thảo nên có một số cái tên có thể xuất hiện nhiều hơn một lần. Danh sách thực tế không có ai trùng tên (sau khi chuẩn hoá) nên các cái tên bị trùng cần được loại ra và không cần tạo email cho cán bộ đó. 

Dữ liệu vào - file văn bản DANHSACH.in:

Mỗi dòng ghi một xâu họ tên (không quá 50 ký tự)
Không có số dòng nên cần đọc đến hết file
Kết quả: Ghi ra các email được tạo ra.

Ví dụ:

Input - DANHSACH.in



    nGUYEn    quaNG   vInH  

   tRan   thi THU    huOnG

   nGO   quoC  VINH

 lE            tuAn    aNH

NGO QUOC VINH

Tran THI THU huong
Output
vinhnq@ptit.edu.vn

huongttt@ptit.edu.vn

vinhnq2@ptit.edu.vn

anhlt@ptit.edu.vn
*/
import java.util.*;
import java.io.*;
public class Bai19 {
    public static void main(String[] args) throws IOException{
//        Scanner input = new Scanner(new File("src/file_storing/bai19/DANHSACH.in"));
        Scanner input = new Scanner(new File("DANHSACH.in"));
        HashMap<String, Integer> mp = new HashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        while (input.hasNextLine()) {
            String s = input.nextLine().trim().toLowerCase();
            map.put(s, 1);
            String a[] = s.split("\\s+");
            String name = a[a.length - 1];
            String temp = "";
            for (String x : a) {
                temp += x + " ";
            }
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
                for (int i = 0; i < a.length - 1; i++) {
                    name += a[i].charAt(0);
                }
                if (mp.containsKey(name)) {
                    mp.put(name, mp.get(name) + 1);
                    name += String.valueOf(mp.get(name));
                } else {
                    mp.put(name, 1);
                }
                System.out.println(name + "@ptit.edu.vn");  
            }
              
            
            
            
        }
    }
}
