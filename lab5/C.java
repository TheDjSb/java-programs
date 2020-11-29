package lab5;

class Aa{
        Aa(int i){
            System.out.println("Aa " + i); }
        }

class Bb{
    Bb(int i){
        System.out.println("Bb " + i); }
}

class Cc extends Aa{
    Cc(int i){
        super(i);
        Bb b = new Bb(i);
    }
}
class Inherit {
    public static void main(String[] args) {
        Cc call = new Cc(5);                //Created an object of class C.
    }
}