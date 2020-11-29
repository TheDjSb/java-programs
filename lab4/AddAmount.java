/*
Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
      1 - without any parameter - no amount will be added to the Piggie Bank
      2 - having a parameter which is the amount that will be added to Piggie Bank
     Create an object of the 'AddAmount' class and display the final amount in Piggie Bank.
 */

package lab4;

 class AddAmount {
       int amount;

      AddAmount(){
           amount = 50;
      }
     AddAmount(int credit){
          amount = credit;
          System.out.println("amount Credited "+amount );
          amount=amount+credit;
     }
}
class Banker{
     public static void main(String[] args){
         AddAmount amt = new AddAmount();
         System.out.println("Saving Amount " + amt.amount);
         AddAmount cramt = new AddAmount(55);
         System.out.println("amount after  Credited "+ cramt.amount);
     }
}