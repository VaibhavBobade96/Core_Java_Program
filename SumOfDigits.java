import java.util.Scanner;

public class SumOfDigits
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);

       System.out.print("Plese Enter a Number :");   // 1234
       int num = sc.nextInt();
       int rem;
       int sum = 0;
       int reverse = 0;

       while(num!=0)
       {

         rem = num % 10;  // 1)4 2)3 3)2 4)1
	     sum = sum + rem ; // 10
	     reverse = reverse * 10 + rem; // 1) 0 * 10 + 4 = 4 2) 4 * 10 + 3 = 43 3) 43 * 10 + 2 = 432 4)432 * 10 + 1 = 4321
         num = num / 10; // 1)123 2)12 1) 1

       }

       System.out.println("Sum of Digits:" + sum);
     }

    }
