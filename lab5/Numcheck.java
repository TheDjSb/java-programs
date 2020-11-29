package lab5;
import java.util.*;

public class Numcheck {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int[] num =new int[20];
        int pos =0;
        int neg = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;

        for(int i=0; i<num.length; i++){
            num[i] = s.nextInt();

            if(num[i]>0){
                pos++;
            }
            else if(num[i]<0){
                neg++;
            }

            else{
                zero++;
            }
            if(num[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Positive : "+pos+"\nNegative : "+neg+"\nZero : "+zero+"\nodd : "+odd+"\neven : "+even);
    }
}