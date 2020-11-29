package Lab2;
import java.util.*;
public class VoterAgeCheck {



    public static void main(String[] args)
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Hey Buddy !! Want to Vote then Lets Check you your Age? :");
        age=sc.nextInt();
        if(age>=18)
            System.out.println("Congrats !! You are eligible to vote.");
        else
            System.out.println("Oh Sorry !! You are not eligible to vote.");

    }

}
