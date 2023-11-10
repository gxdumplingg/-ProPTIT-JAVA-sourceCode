import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

//public class Person {
//    private String name;
//    private int age;
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return this.age;
//    }
//    public void setAge(int age) {
//        if (age >= 0 && age <= 100)
//            this.age = age;
//    }
//    public void getInfo() {
//        System.out.println("Ho va ten: " + this.name);
//        System.out.println("Tuoi: " + this.age);
//    }
//    public static void main(String[] args) {
////        Person a = new Person("Giang", 19);
////        Scanner sc = new Scanner (System.in);
////        a.setAge(20);
////        a.setName("Giang");
////        System.out.println(a.getAge() + " " + a.getName());
//
//
//    }
//}
//public class Person {
//    private String name;
//    private int age;
//    public Person(){
//        this.name = "Giang";
//        System.out.println("Ten toi la " + name);
//    }
//    public Person(String ten){
//        this.name = ten;
//        System.out.println("My name is " + name);
//    }
//    public Person(String ten, int tuoi){
//        this.name = ten;
//        this.age = tuoi;
//        System.out.println("Ten: " + name + ", tuoi: " + age);
//    }
//    public static void main(String args[]){
//        Person a = new Person();
//        Person b = new Person("Giang");
//        Person c = new Person("Jane", 20);
//    }
//}
public class Person{
    private String name;
    int age;
    public Person(){
        this ("Giang", 19);
    }
    public Person(String name){
        this(name, 25);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        Person p2 = new Person("Alex");
        p2.display();
        Person p3 = new Person("Jane", 20);
        p3.display();
    }
}

