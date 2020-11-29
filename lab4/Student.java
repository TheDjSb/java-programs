/*
Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown",
 otherwise the name should be equal to the String value passed while creating the object of Student class

 */
package lab4;

//The Student class actually has 2 constructors.
// One doesn’t take any parameters and one takes the
class Student {
    String name;
    //constructor with parameters
    public Student(String stu){
        name=stu;
    }
    //no argument constructor(it sets to default values)
public Student(){
        name="unknown";
}
}
class Program{
    public static void  main(String[] args){

        Student stu = new Student("Subarna");
        Student withnoag = new Student();
        System.out.println(stu.name);
        System.out.println(withnoag.name);
    }
}
