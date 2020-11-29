package assign2;
public class TEST {
    public static void main (String args[])
    {
        int i =0;
        int num =0;
        String  primeNumbers = "";
          int n=Integer.parseInt(args[0]);
        for (i = 1; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to n are :");
        System.out.println(primeNumbers);
    }
}

