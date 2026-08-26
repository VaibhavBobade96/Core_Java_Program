import java.util.Scanner;

public class ReverseNo
{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("Please Enter a Number:");        // 1234
       int num = sc.nextInt();

       int reverse = 0;
	   int rem;

       if(num!=0)
       {
          while(num!=0)
        {
	      rem = num % 10;   // 1)  rem = 4  2) 43 3) 432  4) 4321+
	      reverse = reverse * 10 + rem;   // 1) 0 * 10 + 4 = 4   2) 4 * 10 + 3 = 43 3) 43 * 10 + 2 = 432 4) 4321
	      num = num/10;   //  1) 123  2) 12  3) 1 
	      
	    }

           System.out.println(" reverse No :" + reverse);
   }

}

}