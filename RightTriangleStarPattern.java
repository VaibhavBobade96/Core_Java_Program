import java.util.Scanner;

public class RightTriangleStarPattern{

   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

       System.out.print("please Enter a Number:");
       int num = sc.nextInt();

       for(int i=1; i<=num; i++)
       {
         for(int j=1; j<=i;j++) // 2<=1
	 {
           System.out.print(" * ");
	 }

	       System.out.println();
   
      }

  }

}


/*

 *
 *

*/