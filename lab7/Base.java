package lab7;
//constructor chain implementation in inheritance
class Base
{
    // default constructor
    Base()
    {
        this("Iam Son");
        System.out.println("Iam Great Grand Father");
    }

    // parameterized constructor
    Base(String son)
    {
        System.out.println("Iam Grand Father with son");
    }
}

class Derived extends Base
{
    // default constructor
    Derived()
    {
        this("Iam Son");
        System.out.println("Iam Father");
    }

    // parameterized constructor
    Derived(String son)
    {
        super();
        System.out.println("Iam Father with son");
    }
}

class MainProgram
{
    // main
    public static void main(String args[])
    {
        // initializes
        Derived familytree = new Derived();
    }
}