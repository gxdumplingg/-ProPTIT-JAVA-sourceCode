public class test {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // đổi int sang Integer
        int backToInt = wrapperInt.intValue(); // đổi Integer về int
        System.out.println(primitiveInt + " " + wrapperInt + " " + backToInt);
    }
}
