package lab7;
//using final in class
//final
class PreventInheritance{}

//trying to inherited using final keyword
class Subc extends PreventInheritance{

    void data(){System.out.println("prevent a class from being inherited using the final keyword.");}

    public static void main(String args[]){
        Subc obj= new Subc();
        obj.data();
    }
}
//OUPUT
//Cannot inherit from final 'lab7.PreventInheritance'
//Compile Time Error