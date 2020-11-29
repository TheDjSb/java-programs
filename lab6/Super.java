package lab6;

public class Super {
    String animal="Dog";
    private String type;

    Super(String type){

        this.type= type ;
    }

}
class Tester extends Super{


    Tester(String type) {
        super(type);
        System.out.println("Animal Name: " +super.animal);
        System.out.println("Animal Type: " + type);
    }
}
class Main{
    public static void main(String[] args){
        Tester type = new Tester("pet");
    }
}