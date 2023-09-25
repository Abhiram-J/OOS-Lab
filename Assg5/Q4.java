abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is the constructor of the abstract class");
    }

    abstract void a_method();

    void normal_method() {
        System.out.println("This is a normal method of the abstract class");
    }
}

class SubClass extends AbstractClass {
    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class Q4 {
    public static void main(String[] args) {
        SubClass subClassInstance = new SubClass();

        subClassInstance.a_method();
        subClassInstance.normal_method();
    }
}
