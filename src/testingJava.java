
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class testingJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bai 1
//        String s1 = sc.next();
//        String s2 = sc.next();
//        System.out.println(s1.length()+s2.length());
//        if (s1.compareTo(s2) > 0 ) System.out.println("Yes");
//        else System.out.println("No");
//        String a = s1.substring(0,1).toUpperCase() + s1.substring(1);
//        String b = s2.substring(0,1).toUpperCase() + s2.substring(1);
//        System.out.println(a+" "+b);

        //bai 2
            /*String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            sb = sb.reverse();
            if (s.equals(sb.toString())) System.out.println("Yes");
            else System.out.println("No");*/
        /*String s = sc.next();
        int check = 1;
        int l =0, r =s.length()-1;
        while (l<r){
            if (s.charAt(l) != s.charAt(r)) {
                check=0;
                break;
            }
            ++l; --r;
        }
        if (check==0) System.out.println("No");
        else System.out.println("Yes");*/

        // bai 3
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] a = new int[n];
//        for (int i=0; i<n; ++i)
//            a[i] = scan.nextInt();
//        scan.close();
//
//        // Prints each sequential element in array a
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
    }
}
















        /*
        Các phương thức String hay dùng
        s.charAt (index)  -> truy cập tới 1 kí tự của xâu s -> trả về kí tự tại index đó
        s.length() -> trả về chiều dài xâu s
        s1.compareTo(s2)
           + s1==s2: trả về 0
           + s1 > s2: trả về giá trị dương
           + s1 < s2: trả về giá trị âm
        s1.concat(s2) hoặc s1+s2: nối chuỗi
        s.toLowerCase(), s.toUpperCase() -> viết thường, viết hoa chuỗi
        s.trim() -> trả về String mới sau khi loại bỏ hết whitespace bên trái và bên phải
        String s1 = s.substring(0, 1) -> xâu s1 sẽ bằng chuỗi được cắt từ vị trí idx 0 đến 1 của xâu s

        * */

        /* Các phương thức StringBuilder
        s.append("abc") -> thêm một chuỗi nào đó vào cuối chuỗi hiện tại của đối tượng StringBuilder.
        s.insert(index, " ") -> chèn 1 chuỗi nào đó vào vị trí index truyền vào
        s.delete(idx start, idx end) -> xóa chuỗi bắt đầu từ idx start -> end
        s.deleteCharAt(i) -> xóa kí tự ở vị trí thứ i
        s.reverse() -> dảo ngược chuỗi
        */


