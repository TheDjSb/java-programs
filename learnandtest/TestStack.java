package learnandtest;

import java.util.EmptyStackException;
import java.util.Stack;
public class TestStack {

    static void showpush(Stack st, String a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        String a = (String) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
    static void search(Stack st) {
        System.out.print("Search -> ");
        int a =  st.search("Sharda");
        System.out.println(a);
        System.out.println("stack search: Sharda ");
    }
    static <string> void peek(Stack st) {
        System.out.print("Peek -> ");
        string a = (string) st.peek();
        System.out.println(a);
        System.out.println("stack Peek:");
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, "Welcome");
        showpush(st, "To");
        showpush(st, "Sharda");
        showpush(st, "University");
        showpush(st, "B-Tech");
        peek(st);
        search(st);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

    }
}