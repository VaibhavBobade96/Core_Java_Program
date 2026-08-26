import java.util.Scanner;

public class CheckPrime2{
 
   public static void main(String[] args)
    { 

      Scanner sc = new Scanner(System.in);
      System.out.print("please Enter a number :"); 
      int num = sc.nextInt();
	  int count = 0;

      for(int i=2; i<=num; i++)
      {
        if(num % i == 0)
	    {
            count++;
	    }

      }

      if(count == 1)
      {
        System.out.println("The Given Number is Prime Number:"+num);

      }
     
      else {

        System.out.println("The Given Number is Not a Prime Number:"+num);
      }
 }

 }