package learnandtest;

class SuperClass1
{
    SuperClass1() // no-arg constructor
    {
        System.out.println("super constructor");
    }
    SuperClass1(int a , int b)// Parametrized constructor
    {
        a=9; b=8;
        System.out.println(a+b);
    }
    void demo() // instance method
    {
        System.out.println("Learning super concept");
    }
}// class SuperClass ends here

class Subclass2 extends SuperClass1
{
    Subclass2()
    {
        super();
        System.out.println("subclass constructor");
    }
    Subclass2(int a, int b, int c)
    {
        super(a,b);
        System.out.print(a+b+c);
        System.out.print("\n");
    }
}
class Subclass1
{
    public static void main(String args[])
    {
        Subclass2 obj = new Subclass2();
        Subclass2 obj1 =new Subclass2(4,5,5);
        obj.demo();
    }
}

