package lab7;

abstract  class Mainclass {
    public Mainclass(){
        System.out.println("This is constructor of abstract class");
    }
    abstract public void  a_method();
    public void non_abstractmethod(){
        System.out.println("This is normal method of abstract class");
    }
}
class Iamsubclass extends Mainclass {

    public void a_method(){
        System.out.println("This is abstract method");
    }

}
class Comp{
    public static void main(String[] args){
        Iamsubclass chip = new Iamsubclass();
        chip.a_method();
        chip.non_abstractmethod();
    }
}