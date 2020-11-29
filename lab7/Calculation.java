package lab7;
//Main class Calculation
public class Calculation {
//Protected access modifier
    protected int addTwoNumbers(int a, int b){
        return a+b;
    }
}
///
//protected modifier allows the access of protected members in subclasses
class Test extends Calculation{
    public static void main(String[] args){
        Test obj = new Test();//object creation
        System.out.println("Result is: ");
        System.out.println(obj.addTwoNumbers(11, 22));//passing parameters
    }
}