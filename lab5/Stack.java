package lab5;

// This class defines an integer stack that can hold 10 values.
 class Stack {
     int[] stck = new int[10];
     int tos;

 // Initialize top-of-stack
  Stack() {
      tos = -1;
  }
  // Push an item onto the stack
void push(int item) {
     if(tos==9)
         System.out.println("Stack is full.");
     else
        stck[++tos] = item;
    }
    // Pop an item from the stack
  int pop()
  {
      if(tos < 0)
  {
      System.out.println("Stack underflow.");
      return 0;
  }
      else
          return stck[tos--];
  }
 }
class TestStack {
     public static void main(String[] args) {
         Stack teststack1 = new Stack();
         Stack teststack2 = new Stack();

         //push some numbers onto the stack
         for ( int i =0; i<10; i++)     teststack1.push(i);
         for ( int i =10; i<20; i++)    teststack2.push(i);
         //pop those numbers off the stack
         System.out.println("Stack 1:");
         for (int i=0; i<10; i++)
             System.out.println ( teststack1.pop());
         System.out.println("Stack 2:");
         for (int i=0; i<10; i++)
             System.out.println (teststack2.pop());

     }
    }