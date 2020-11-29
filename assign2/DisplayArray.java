package assign2;

import java.util.Scanner;

public class DisplayArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        System.out.println("Enter 10 values (1-100): ");

        for (int i = 0;i<array.length;i++) {

            array[i] = sc.nextInt();

        }

        System.out.print("Contents of Array: ");

        for (int j : array) {

            System.out.print(j + " ");

        }

        int max = array[0];

        for (int i = 1;i<10;i++) {

            if (max<array[i]) {

                max = array[i];

            }

        }

        System.out.println("\n");

        System.out.println("The largest value in Array is: " + max);

    }

}