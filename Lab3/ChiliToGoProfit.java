package Lab3;

import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {

        final double ADULT_PRICE = 7;
        final double CHILD_PRICE = 4;
        final double ADULT_COST_PRICE = 4.35;
        final double CHILD_COST_PRICE = 3.10;
        int adultMeals, childMeals;
        double totalAdult, totalChild,totalAdultPR, totalChildPR, grandTotal,totalProfit,grandProfit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Adult meals ordered :");
        adultMeals = input.nextInt();
        System.out.print("Enter the number of Child meals ordered :");
        childMeals = input.nextInt();
        totalAdult = adultMeals * ADULT_PRICE;
        totalChild = childMeals * CHILD_PRICE;
        totalAdultPR = adultMeals * ADULT_COST_PRICE;
        totalChildPR = childMeals * CHILD_COST_PRICE;
        grandTotal = totalAdult + totalChild;
        totalProfit = totalAdultPR + totalChildPR;
        System.out.println(adultMeals + "  Adult Meals ordered at " + ADULT_PRICE + " each.");
        System.out.println("Total is  :" + totalAdult );
        System.out.println(childMeals + "  Adult Meals ordered at " + CHILD_PRICE + " each.");
        System.out.println("Total is  :" + totalChild );
        System.out.println("Grand total for all meals is : " + grandTotal );
        grandProfit = grandTotal - totalProfit;
        System.out.println("Total Profit : " + grandProfit );

    }
}
