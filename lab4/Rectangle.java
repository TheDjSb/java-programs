/*
Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. The class has three constructors which are:
           1 - having no parameter - values of both length and breadth are assigned zero.
           2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
           3 - having one number as parameter - both length and breadth are assigned that number.
        Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
 */
package lab4;

//Rectangle class

class Rectangle{
    //For final, it can be assigned different values at runtime when initialized
    private final int length;
    private final int width;
//constructor with no parameter
    Rectangle(){
        this.length=0; //default length value =0
        this.width=0; //default width value =0
    }
    //constructor with two parameter
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    //constructor with one parameter
    Rectangle(int onep){
        this.length=onep;
        this.width=onep;
    }
    //method to calculate both
    int area(){
        return length*width;
    }
}
class TestRectangle{
    public static void main(String[] args){
        //objects of the 'Rectangle' class having none, one and two parameters and print their areas.
        Rectangle withnop= new Rectangle();
        System.out.println("Area of reactangle with no paramerter: "+ withnop.area());
        Rectangle withonep= new Rectangle(5);
        System.out.println("Area of reactangle with one paramerter: "+ withonep.area());
        Rectangle withthreep= new Rectangle(5,8);
        System.out.println("Area of reactangle with two paramerter: "+ withthreep.area());
    }
}