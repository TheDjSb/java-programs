package Lab3;
import java.util.*;

public class Eggs{

    public static void main (String [] args)

    {

        int noOfEggs, dozen, units;
        float total;
        Scanner input = new Scanner(System.in);
        noOfEggs = input.nextInt();
        if(noOfEggs < 0)
        {
            System.out.print("Invalid");
        }
        else
        {
            if(noOfEggs >= 12)
            {
                dozen = noOfEggs/12;
                units = noOfEggs % 12;
            }
            else
            {
                dozen = 0;
                units = noOfEggs;
            }
            total = (float) (dozen * 3.25 + (units * 45)/100);
            System.out.print("You ordered "+noOfEggs+" eggs.\n");
            System.out.print("That's "+dozen+" dozen at $3.25 per dozen and "+units+" loose eggs at 45 cents each for a total of $"+total);
        }

    }

}