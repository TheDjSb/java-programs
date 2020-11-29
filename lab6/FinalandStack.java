package lab6;

//We cannot override static methods. Static methods are belongs to class, not belongs
// to object. Inheritance will not be applicable for class members
class FinalandStatic {
    static  void display() {
        System.out.println("Super class");
    }
}
class Example extends FinalandStatic {
   // void display() {// trying to override display() {
      //  System.out.println("Sub class");
    //}
    public static void main(String[] args) {
        FinalandStatic obj = new Example();
        obj.display();
    }
}