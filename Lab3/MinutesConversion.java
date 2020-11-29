package Lab3;
import java.util.*;
public class MinutesConversion {
    public static void main(String[] args) {

        int minutes, hours;
        float days;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter minutes for conversion >> ");
        minutes = input.nextInt();
        hours = minutes / 60;
        days = hours / 24.0f;
        System.out.println("\nYou have entered " + minutes + " minutes." + "\n" + minutes + " minutes is " + hours + " hour(s). \n" + minutes
                + " minutes is " + days + " days(s). ");
    }
}
