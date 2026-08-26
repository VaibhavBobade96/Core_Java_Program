import java.util.Scanner;
 
public class StarSquare{

  public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.println("Please enter a number :");
      int num = sc.nextInt();

      for(int i=1; i<=num; i++) // Row 
       {  
         for(int j=1; j<=num; j++)   // Column
	     {
            System.out.print(" * ");
	     }

	      System.out.println();

       }

    }
}

/* Logic 

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

   