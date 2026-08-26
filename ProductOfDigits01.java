import java.util.Scanner;

public class ProductOfDigits01
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

     System.out.println("Please enter a number:");   // 1234
     int num = sc.nextInt();
     int rem;
     int mult = 1;
     int reverse=0;
     while(num != 0)
     {
        rem = num % 10;  //4 --- 3-----2---1
	    mult = mult * rem; //  1*4=4 --- 12----24 ----24
	    reverse = reverse * 10 + rem; // 0*10+4=4 ---4*10+3=43---43*10+2=432----432*10+1=4221
	    num = num/10; //123----12---1

		  
     }

       System.out.println("Product of Digits = " +mult);

    }

   }

