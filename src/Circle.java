//public class Circle {
//    private double r;
//    private String color;
//    public Circle(){
//        r = 1.0;
//        color = "white";
//    }
//
//    public static void main(String[] args) {
//        Circle c1 = new Circle();
//        System.out.println("Circle has: r = " + c1.r + " " + ", color: " + c1.color);
//    }
//}
public class Circle{
    public int r = 5;
    void change (Circle c1){
        c1.r = c1.r+10;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Before: r = " + c1.r);
        c1.change(c1);
        System.out.println("After r = " + c1.r);
        System.out.println(c1);
    }
}