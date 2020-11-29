package lab6;
//Upcasting : Converting a subclass type to a superclass type is known as up casting
public class Upcasting {
    void data() {
        System.out.println("Subarna is from Superclasss");
    }
}

class Subclass extends Upcasting {
    void data() {
        System.out.println("Basnet is from subclass");
    }

    public static void main(String[] args) {
       Upcasting obj= (Upcasting) new Subclass(); obj.data();
    }
}