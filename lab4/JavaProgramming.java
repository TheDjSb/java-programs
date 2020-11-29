/*
Create a class named 'Java-Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating an object if we pass "Java", then "I love Java" should be printed.
 */

package lab4;

class JavaProgramming {
    String messenger ="I love ";
   public JavaProgramming() {
          String demo = "programming languages";
          messenger= messenger + demo;
    }
   public JavaProgramming(String sender) {
        messenger= messenger +sender;
    }
}
class Server{
    public static void main(String[] args){
        JavaProgramming withnop = new JavaProgramming();
        System.out.println(withnop.messenger);
        JavaProgramming withp = new JavaProgramming("Java");
        System.out.println(withp.messenger);
    }


}