package learnandtest;
/*
CREATE A SUPERCLASS CALLED FIGURE THAT STORES THE DIMENSIONS OF A TWO-DIMENSIONAL OBJECT.
 IT ALSO DEFINES A METHOD CALLED AREA ( ) THAT COMPUTES THE AREA OF AN OBJECT.
 THE PROGRAM DERIVES TWO SUBCLASSES FROM FIGURE. THE FIRST IS RECTANGLE AND THE SECOND IS TRIANGLE.
 EACH OF THESE SUBCLASSES OVERRIDES AREA ( ) SO THAT IT RETURNS THE AREA OF A RECTANGLE AND A TRIANGLE, RESPECTIVELY.
 */
//A SUPERCLASS CALLED FIGURE THAT STORES THE DIMENSIONS OF A TWO-DIMENSIONAL OBJECT

class Figure {
    //assigning instance variable
    int  dim1,dim2;
    //Constructor
    Figure(int a,int b)// Parametrized constructor
    {
        dim1=a;
        dim2=b;
    }
    // defining method
    void area(){

        System.out.println("Area Calculation");
    }
}
// class SuperClass ends here
//Defining two subclass

//Rectangle Subclass from parent Figure
class Rectangle extends learnandtest.Figure {
    //constructor
    Rectangle(int c,int d){// Parametrized constructor
        super(c,d);

    }

    //area method
    void area(){
        System.out.println("Area of Rectangle is :" + dim1*dim2);
    }
}

//Triangle Subclass from parent Figure
class Triangle extends learnandtest.Figure {

    //constructor
    Triangle(int e, int f) {// Parametrized constructor
        super(e, f);
    }

    //calculating area of triangle with provided values
    void area(){
        System.out.println("Area of Triangle is :"+ (dim1*dim2)/2);
    }
}

//main class
class CPU{
    public static void main(String[] args){
        //creating object for  rectangle  passing two values
        learnandtest.Figure recfetch = new learnandtest.Rectangle(10,5);
        //creating object for triangle passing two values
        learnandtest.Figure trainfetch = new learnandtest.Triangle(20,8);
        // IT RETURNS THE AREA OF A RECTANGLE AND A TRIANGLE, RESPECTIVELY.

        recfetch.area();//calling  rectangle
        trainfetch.area();//calling traingle
    }
}
