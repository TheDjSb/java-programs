package learnandtest;

abstract  class Aabstract {

    abstract void callme();

    void callmetoo(){
        System.out.println("hello con");
    }
}
abstract class Babstract extends Aabstract {

    abstract void callme();
}
class AbstractDemo
{
    public static void main(String[] args)
    {
        Aabstract a = new Babstract() {
            @Override
            void callme() {

            }
        };
        a.callme();
        a.callmetoo();

    }
}