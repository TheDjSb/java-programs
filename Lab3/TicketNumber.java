package Lab3;
import java.util.*;
public class TicketNumber {
    public static void main(String[] args) {
        int ticketNum;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a ticket number >> ");
        ticketNum = input.nextInt();
        int remainingDigits = ticketNum/10;
        int lastDigit = ticketNum%10;
        boolean ticketValidation = (remainingDigits % 7) == lastDigit;
        System.out.println("this ticket number is " + ticketValidation);

    }
}
