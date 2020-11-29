package lab5;

public class Keywords {
   // The static variable can be used to refer to the common property of all objects (which is not unique for each object),
   // for example, the company name of employees, college name of students, etc.
   //The static variable gets memory only once in the class area at the time of class loading.
    static String name="Subarna"; //static variable

    //Is used to initialize the static data member.
    //It is executed before the main method at the time of classloading.
    static{
        System.out.println("Basnet");
    } //static block executed before the main method at the time of classloading.

    String thiskey="CSE"; //instance variable
    Keywords(String thiskey){ //constructor with arguments
        this.thiskey = thiskey; //using this keyword

    }
    void display(){
        System.out.println(thiskey); //output from given arguments
    }
    public static void main(String[] args){
        System.out.println(name);
        Keywords test = new Keywords("JAVA");
        test.display();

    }
}
