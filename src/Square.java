class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Vẽ hình vuông...");
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        shape1.draw(); // gọi phương thức draw() của lớp Circle
        shape2.draw(); // gọi phương thức draw() của lớp Square
    }
}