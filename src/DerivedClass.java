public class DerivedClass{

    String firstName;
    String country;
    int age;

    public DerivedClass() {
        // calling one argument constructor
        this("Maggie");
    }

    public DerivedClass(String firstName) {
        // calling two argument constructor
        this(firstName, 15);
    }

    public DerivedClass(String firstName, int age) {
        // calling three argument constructor
        this(firstName, age, "Australia");
    }

    public DerivedClass(String firstName, int age, String country) {
        this.firstName = firstName;
        this.age = age;
        this.country = country;
    }

    void displayValues() {
        System.out.println("First Name : " + firstName);
        System.out.println("Country : " + country);
        System.out.println("Age : " + age);
    }

    public static void main(String args[]) {
        DerivedClass object = new DerivedClass();
        object.displayValues();
    }
}