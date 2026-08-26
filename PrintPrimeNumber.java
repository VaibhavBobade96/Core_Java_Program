import java.util.Scanner;

public class PrintPrimeNumber{

    public static void main(String[] args)
     { 
       Scanner sc = new Scanner(System.in);

       System.out.print("please enter a number : ");
       int num = sc.nextInt();
	   
       for(

	   int count = 0;
	   for(int i=1; i<=num; i++)
	   {
          if(num % i == 0)
		   {
              count++;

		   }
		   
	   }

	   System.out.println(count);

	   if(count == 2)
	   {
		   System.out.println("The Prime Numbers :" + num);
	   }
	   
	 }

}

	   
	   
