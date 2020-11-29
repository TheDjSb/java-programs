package assign2;


public class Person
{
    public  String personname;
    public  double  sal;
     Person(String register,double  amt)
    {
        personname = register;
        sal=amt;
    }



    public void display(){
        System.out.println("Name :" + personname);
        System.out.println("Salary :$" + sal);
        System.out.println("-------------");
    }
}
class Politician extends Person{
    Politician(String name,double salary){
        super(name,salary);
        System.out.println("Politician");
    }

}
class Sportsman extends Person{
    Sportsman(String name,double salary){
        super(name,salary);
        System.out.println("Sportsman");
    }

}

class Program{
    public static  void main(String[] args){
    Person politc = new Politician("Barak Obama",800000);
    politc.display();
    Person sport = new Sportsman("Ronaldo",500000);
    sport.display();
    }
}