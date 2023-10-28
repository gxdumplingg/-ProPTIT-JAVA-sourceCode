import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class testingJava {
    static double r;
    public static void calc() {
        double chuVi = 2 * r * Math.PI;
        double dienTich = r * r * Math.PI;
        System.out.println(chuVi);
        System.out.println(dienTich);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        calc();
    }
    public static void main2(String[] args) {
        int n = 10;
        System.out.println(n);
        
    }
}
