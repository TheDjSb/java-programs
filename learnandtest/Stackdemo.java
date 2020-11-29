package learnandtest;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args)
    {

        Stack<String> stack = new Stack<>();
        //stack push method
        stack.push("Welcome");
        stack.push("To");
        stack.push("Sharda");
        stack.push("University");
        stack.push("B-Tech");
        System.out.println("//Stack output ");
        //Stack output
        System.out.println("Initial Stack: " + stack);
        System.out.println("//stack search() method ");
        //stack search() method
        int position = stack.search("Sharda");
        System.out.println("Position of Sharda: " + position);
        System.out.println("//stack peek() method");
        //stack peek() method
        System.out.println("The element at the top of the" + " stack is: " + stack.peek());
        System.out.println(" //stack pop() method");
        //stack pop() method
        String element = stack.pop();
        System.out.println("Removed Element: " + element);
        System.out.println(" //stack empty() method");
        //stack empty() method
        boolean result = stack.empty();
        System.out.println("Is the stack empty? " + result);
        System.out.println("  //Final Output");
        //Final Output
        System.out.println("Final Stack: " + stack);
    }
}
