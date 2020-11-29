package learnandtest;
//defining class
class Data2{
    //method for changing data
    int data1= 20;
    int data2 = 20;
    void changeData(Data2 obj,int calldata1,int calldata2){//declaring variables
        //for adding value to  variable
        obj.data1+=calldata1;
        obj.data2+=calldata2;
    }
}
public class referance {


        public static void main(String args[]){
            //making  object for data2
            Data2 dataobject = new Data2();
            //to show the output of assigned variable before change
            System.out.println("data1 is "+ dataobject.data1);
            System.out.println("data1 is "+ dataobject.data2);
            dataobject.changeData(dataobject,20,20);
            //showing output after change
            System.out.println("After the Data changed");
            System.out.println("data1 is "+ dataobject.data1);
            System.out.println("data1 is "+ dataobject.data2);


        }
    }

/*OUTPUT

 */