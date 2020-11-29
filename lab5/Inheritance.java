package lab5;

public class Inheritance {
    public void A(){
        System.out.println("Class A method");
    }
}
class Inheri2 extends Inheritance{
    public void B(){
        System.out.println("Class B method");
    }
}
class Inher3 extends Inheri2 {
    public void C() {
        System.out.println("Class C method");
    }


    public static void main(String[] args) {
     Inheri2 single = new Inheri2();
     System.out.println("Single Level Inheritance");
     single.A();
     single.B();
     System.out.println(".....................");
     Inher3 multilevel = new Inher3();
     System.out.println("Multi level Inheritance");
     multilevel.A();
     multilevel.B();
     multilevel.C();

    }
}