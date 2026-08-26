import java.util.Scanner;

public class LeapCenturyYear{

public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   System.out.print("Please Enter a number :");
   int year = sc.nextInt();

   if(year % 4 == 0)
   { 
      if(year % 100 == 0)
      { 
         if(year % 400 == 0)
	     {
            System.out.println("Leap Century Year :");
	     }
		 else{
             System.out.println("century but not a Leap Year:");
		 }
       }
       else{
          System.out.println(" Leap  Year :");
	}
    } else
    {
       System.out.println("Not a Leap Year:");
     }
   }

 }