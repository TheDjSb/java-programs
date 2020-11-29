package learnandtest;

// How to call the constructor of a superclass from a constructor in java?

class SuperClass
{
    SuperClass()// constructor
    {
        System.out.println("super constructor");
    }
    void demo()
    {
        System.out.println("Learning super concept");
    }
}// class SuperClass ends here

class SubClass extends SuperClass
{
    SubClass()
    {
        System.out.println("subclass constructor");
    }
    public static void main(String args[])
    {
        SubClass obj = new SubClass();
        obj.demo();
    }
}
//In inheritance constructors are not inherited. You need to call them explicitly using the super keyword.
