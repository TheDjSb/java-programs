package lab6;
//Downcasting: Converting a superclass type to a subclass type is known as downcasting.
public class Downcasting {
    void data() {
        System.out.println("Subarna is from superclass");
    }
}

class Subclasses extends Downcasting {
    void data() {
        System.out.println("Basnet is from sub class");
    }

    public static void main(String[] args) {
        Downcasting obj = new Subclasses();
        Subclasses sub = (Subclasses) obj; sub.data();
    }
}