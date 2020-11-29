package Lab3;
import java.util.*;
public class ChiliToGo {
    public static void main(String[] args) {

        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 4;
        int adultMeals, childMeals;
        double totalAdult, totalChild, grandTotal;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Adult meals ordered :");
        adultMeals = input.nextInt();
        System.out.print("Enter the number of Child meals ordered :");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        grandTotal = totalAdult + totalChild;
        System.out.println(adultMeals + "  Adult Meals ordered at " + ADULT_PRICE + " each.");
        System.out.println("Total is  :" + totalAdult );
        System.out.println(childMeals + "  Adult Meals ordered a t" + CHILD_PRICE + " each.");
        System.out.println("Total is  :" + totalChild );
        System.out.println("Grand total for all meals is : " + grandTotal );

    }

}
