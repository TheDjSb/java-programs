package Lab2;
import java.util.*;
public class PrintDayInWord {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 7: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();


        if (number == 1) {
            System.out.println( "Sunday" );
        } else if ( number ==2 ) {
            System.out.println( "Monday" );
        } else if ( number ==3 ) {
            System.out.println( "Tuesday" );

        }  else if ( number ==4 ) {
            System.out.println( "Wednesday" );

        } else if ( number ==5 ) {
            System.out.println( "Thursday" );

        } else if ( number ==6 ) {
            System.out.println( "Friday" );

        } else if ( number ==7 ) {
            System.out.println( "Saturday" );

        }else {
            System.out.println( "Not a Valid Day" );
        }


        switch (number) {

            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Not a Valid Day");
        }
    }
}
