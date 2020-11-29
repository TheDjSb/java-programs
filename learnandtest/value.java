package learnandtest;
//defining class
class Data{
    public int instancedata1=20;
    public int instancedata2=20;
    void changeData(int instancedata1,int instancedata2){//declaring variables
        //for adding value to  variable
        instancedata1+=20;
        instancedata2+= 20;
    }
}
public class value {
        public static void main(String args[])
        {
            //assigning new variables
            int data1 =20, data2=20;
            //to show the output of assigned variable before change
            System.out.println("data1 is "+data1);
            System.out.println("data2 is "+data2);
            //making  object for data
            Data dataobject = new Data();
            //performing call by value by passing data1 and data2
            dataobject.changeData(data1,data2);
            //showing output after change
            System.out.println("After the data Change");
            System.out.println("data1 is "+data1);
            System.out.println("data1 is "+data2);

        }

}
/*OUTPUT
        data1 is 20
        data2 is 20
        After the data Change
        data1 is 20
        data1 is 20
        */
