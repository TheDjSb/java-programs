package lab6;

public class Override {
    void show()
    {
        System.out.println("Before Override");
    }
}

// Inherited class
class Child extends Override {
    // This method overrides show() of Parent

    void show()
    {
        System.out.println("After Override");
    }
}

class Mains {
    public static void main(String[] args)
    {
        // parent show is called
        Override obj1 = new Override();
        obj1.show();
        // child show is called
        Override obj2 = new Child();
        obj2.show();
    }
}
