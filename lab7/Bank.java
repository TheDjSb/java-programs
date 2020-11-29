package lab7;
//abstract class bank
abstract class Bank {
    //defining double variable
    public  double  a;
    Bank(double a){//construtor with parameter
        this.a = a; //using this keyword

    }
    abstract public void getbalance();//abstract method

}
 class Banka extends Bank {//Subclass of Bank

     Banka(double a) {//construtor with parameter
         super(a); //using super class to get main class
     }

     public void  getbalance() {//calling abstract class
         System.out.println("Balance deposit in Bank A $"+a);
     }

 }
class Bankb extends Bank {//Subclass of Bank

    Bankb(double a) {//construtor with parameter
        super(a);//using super class to get main class
    }

    public void  getbalance() {//calling abstract class
        System.out.println("Balance deposit in Bank B $"+a);
    }

}
class Bankc extends Bank {//Subclass of Bank

    Bankc(double a) {//construtor with parameter
        super(a);//using super class to get main class
    }

    public void  getbalance() {//calling abstract class
        System.out.println("Balance deposit in Bank C $"+a);
    }

}

class Systems{

    public static void main(String[] args){
        Bank banka = new Banka(100);//making object of banka using dynamic dispatch
        banka.getbalance();//calling abstract method
        Bank bankb = new Bankb(150);//making object of bankb using dynamic dispatch
        bankb.getbalance();//calling abstract method
        Bank bankc = new Bankc(200);//making object of bankc using dynamic dispatch
        bankc.getbalance();//calling abstract method


    }
}