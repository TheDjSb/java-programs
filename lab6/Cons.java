package lab6;
//constructor chaining in multilevel inheritance
public class Cons {
    // default constructor
    Cons()
    {
        this("Iam Son");
        System.out.println("Iam Great Grand Father");
    }

    // parameterized constructor
    Cons(String son)
    {
        System.out.println("Iam Grand Father with son");
    }
}

class Father extends Cons
{
    // default constructor
    Father()
    {
        this("Iam Son");
        System.out.println("Iam Father");
    }

    // parameterized constructor
    Father(String son)
    {
        super();
        System.out.println("Iam Father with son");
    }
}
class Son extends Father
{
    // default constructor
    Son()
    {
        this("Iam Son");
        System.out.println("Iam Son");
    }

    // parameterized constructor
    Son(String son)
    {
        super();
        System.out.println("Iam Son with my child");
    }
}

class FamilyTree
{
    // main
    public static void main(String[] args)
    {
        // initializes
        Son familytree = new Son();
    }
}