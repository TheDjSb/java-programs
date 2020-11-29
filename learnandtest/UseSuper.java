package learnandtest;

// Using super to overcome name hiding.
class A11

{
    int i;
}

//Create a subclass by extending class A.
class B11 extends A11
{
    int i; // this i hides the i in A

    B11(int a, int b)
    {
        super.i = a; // i in A11
        i = b; // i in B11
    }
    void show()
    {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
class UseSuper
{
    public static void main(String args[])
    {
        B11 subOb = new B11(1, 2);
        subOb.show();
    }
}

