/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai8;

/**
 *
 * @author P51
 */
/*
Cho dãy số A[] gồm có N phần tử. Nhiệm vụ của bạn là hãy sắp xếp dãy số này theo tần suất xuất hiện của chúng. Số nào có số lần xuất hiện lớn hơn in ra trước. Nếu có 2 số có số lần xuất hiện bằng nhau, số nào xuất hiện trong dãy A[] trước sẽ được in ra trước.

Chú ý: Nên cố gắng sử dụng các lớp phù hợp trong Java. 

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 10).

Mỗi test gồm số nguyên N (1≤ N ≤ 100 000), số lượng phần tử trong dãy số ban đầu.

Dòng tiếp theo gồm N số nguyên A[i] (-10^9 ≤ A[i] ≤ 10^9).

Output: 

Với mỗi test, in ra trên một dòng là dãy số thu được sau khi thực hiện sắp xếp.

 

Ví dụ:

Input:


2

8

2 5 2 8 5 6 8 8

10

2 5 2 6 -1 9999999 5 8 8 8

 
Output

8 8 8 2 2 5 5 6

8 8 8 2 2 5 5 6 -1 9999999


*/
import java.util.*;
public class Bai8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            Map<Integer, Integer> mp = new HashMap<>();
            ArrayList<Number> numbers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = input.nextInt();
                if (!mp.containsKey(x)) {
                    numbers.add(new Number(x));
                    mp.put(x, 1);
                } else {
                    for (Number a : numbers) {
                        if (a.getValue() == x) {
                            a.setFre();
                            break;
                        }
                    }
                }
            }
            Collections.sort(numbers);
            for (Number x : numbers) {
                for (int i = 0; i < x.getFre(); i++) {
                    System.out.print(x + " ");
                }
                
            }
            System.out.println();
        }
        
    }
}
