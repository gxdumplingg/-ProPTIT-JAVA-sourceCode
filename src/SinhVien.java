import java.util.*;
import java.util.Scanner;
public class SinhVien {
    public String name;
    public int age;
    //Constructor
    public SinhVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Giang", 19);
//        System.out.println(sv1.toString());
        System.out.println(sv1);
    }
}
// alt + insert -> tao constructor ...

