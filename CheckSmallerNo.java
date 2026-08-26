import java.util.Scanner;

public class CheckSmallerNo{
 
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first No:");
      int num1 = sc.nextInt();

      System.out.println("Enter Second No:");
      int num2 = sc.nextInt();

      System.out.println("Enter Third No:");
      int num3 = sc.nextInt();

      if(num1 < num2)
      {
          if(num1 < num3)
	  { 
              System.out.println("Num 1 is smaller No :" +num1);
	   }
	   else{
              
              System.out.println("num 3 is Smaller nO :" +num3);
	   }
        }
	 else{

            if(num2 < num3)
	    {
              System.out.println("NUm 2 is Smaller No : "+num2);
	    }
           else
	   {
             System.out.println("Num 3 is Smaller NO :"+num3);
	   }

	 }

   }

 }
