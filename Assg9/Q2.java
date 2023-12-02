interface Animal {
    void move();

    void cry();

}

class Cat implements Animal {
    private static Cat c;

    private Cat() {
    }

    public static Cat getInstance() {
        if (c != null) {
            System.out.println("Returning already created instance");
        } else {
            System.out.println("Returning new instance");
            c = new Cat();
        }
        return c;
    }

    public void move() {
        System.out.println("Cat is moving...");
    }

    public void cry() {
        System.out.println("Cat is crying...");
    }

}

class Dog implements Animal {
    private static Dog d;

    private Dog() {
    }

    public static Dog getInstance() {
        if (d != null) {
            System.out.println("Returning already created instance");
        } else {
            System.out.println("Returning new instance");
            d = new Dog();
        }

        return d;
    }

    public void move() {
        System.out.println("Dog is moving...");

    }

    public void cry() {
        System.out.println("Dog is crying...");

    }

}

class Horse implements Animal {
    private static Horse h;

    private Horse() {
    }

    public static Horse getInstance() {
        if (h != null) {
            System.out.println("Returning already created instance");
        } else {
            System.out.println("Returning new instance");
            h = new Horse();
        }

        return h;
    }

    public void move() {
        System.out.println("Horse is moving...");

    }

    public void cry() {
        System.out.println("Horse is crying...");

    }

}

public class Q2 {
    public static void main(String[] args) {

        Animal c1 = Cat.getInstance();
        Animal c2 = Cat.getInstance();

        Animal d1 = Dog.getInstance();
        Animal d2 = Dog.getInstance();
        Animal h1 = Horse.getInstance();
        Animal h2 = Horse.getInstance();

    }
}
