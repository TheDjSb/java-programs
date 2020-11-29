package lab7;

abstract class Marks {
   public  double cal;
//abstract class
    abstract public void getpercentage();

}
//subclass of Marks
class A extends Marks{
    double one,two,three;
    A(double one,double two,double three){
     this.one =one;
     this.two =two;
     this.three =three;

     cal = one +two +three ;
    }

    public void getpercentage(){
    System.out.println("3 Subject Percentage of Student a is " + cal/300*100 +" %");
    }
}
class B extends Marks{

    double one,two,three,four;
    B(double one,double two,double three,double four){
        this.one =one;
        this.two =two;
        this.three =three;
        this.four =four;
        cal = one +two + three + four;
    }

    public void getpercentage(){
        System.out.println("4 subject Percentage of Student b is " + cal/400*100 +" %");
    }
}

class Proctor{
    public static void main(String[] args){
        Marks studenta = new A(50,60,70);
        studenta.getpercentage();
        Marks studentsb = new B(70,50,60,30);
        studentsb.getpercentage();
    }
}