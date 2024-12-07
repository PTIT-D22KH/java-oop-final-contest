/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai12;

/**
 *
 * @author P51
 */
/*
Trên hệ thống phim của một website có các thông tin bộ phim bao gồm Mã phim, Tên phim, Ngày khởi chiếu, Số tập phim, Thể loại. Mã phim được đánh số tự động từ P001, P002 và tự động tăng dần. Thể loại phim bao gồm thông tin Mã thể loại và Tên thể loại. Mã thể loại được đanh số tự động tăng dần từ TL001, TL002

Cho danh sách các phim trên hệ thống, hãy thực hiện sắp xếp danh sách các bộ phim theo thứ tự ưu tiên ngày khởi chiếu tăng dần, tên phim sắp xếp theo thứ tự từ điển, số tập phim giảm dần.

Input:

Dòng đầu tiên cho 2 số N, M lần lượt là số lượng thể loại và số lượng bộ phim.

N dòng tiếp theo là thông tin tên thể loại. Mã thể loại tự động sinh theo thứ tự nhập vào

M dòng còn lại mỗi dòng là thông tin phim bao gồm Mã thể loại, ngày khởi chiếu (dd/mm/yyyy) tên phim và số tập phim (số nguyên tối đa 10000).

Output:

Danh sách phim đã sắp xếp như mẫu, mỗi phim trên một dòng

Ví dụ:

Input



2 3

Hai huoc

Tinh cam

TL001

25/11/2021

Phim so 1

10

TL001

04/12/2021

Phim so 2

15

TL002

25/11/2021

Phim so 3

5
Output
P001 Hai huoc 25/11/2021 Phim so 1 10
P003 Tinh cam 25/11/2021 Phim so 3 5
P002 Hai huoc 04/12/2021 Phim so 2 15


*/
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Bai12 {
    public static void main(String[] args) throws IOException, ParseException{
//        Scanner input = new Scanner(new File("src/file_storing/bai12/DATA.in"));
        Scanner input = new Scanner(System.in);
        String a[] = input.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        ArrayList<Category> categories = new ArrayList<>();
        int countCat = 0;
        for (int i = 0; i < n; i++) {
            categories.add(new Category(String.format("TL%03d", ++countCat), input.nextLine()));
        }
        ArrayList<Film> films = new ArrayList<>();
        int countFilms = 0;
        for (int i = 0; i < m; i++)  {
            String categoryId = input.nextLine();
            Category x = null;
            for (Category b : categories) {
                if (b.getCategoryId().equals(categoryId)) {
                    x = b;
                    break;
                }
            }
            films.add(new Film(String.format("P%03d", ++countFilms), input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()), x));
        }
        Collections.sort(films);
        for (Film x : films) {
            System.out.println(x);
        }
        
    }
}
