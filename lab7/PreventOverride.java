package lab7;
//Main class
public class PreventOverride {
    //final to prevent method from override
    //final
    void speed(){
        System.out.println("running");
    }
}
class Sub extends PreventOverride{
    //trying to override
    void speed(){
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]){
       Sub obj= new Sub();
        obj.speed();
    }
}
//output
//'speed()' cannot override 'speed()' in 'lab7.PreventOverride'; overridden method is final
//Compile Time Error