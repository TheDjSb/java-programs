package assign2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DayofWeek {
    public static  void main(String[] args){
        ArrayList<String> weeks=new ArrayList<>(Arrays.asList("Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        scanner.close();
        if(n==0){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==1){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==2){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==3){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==4){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==5){
            String num = weeks.get(n);
            System.out.println(num);
        }
        else if(n==6){
            String num = weeks.get(n);
            System.out.println(num);
        }else if(n==7){
            String num = weeks.get(n);
            System.out.println(num);
        }else {
            System.out.println("Error");
        }





    }

}
