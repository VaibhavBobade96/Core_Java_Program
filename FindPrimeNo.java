import java.util.Scanner;

public class FindPrimeNo{

   public static void main(String[] args)

     { 
         Scanner sc = new Scanner(System.in);

	 System.out.print("please Enter a number :");
	 int num = sc.nextInt();
     int count = 0;
	 for (int i=1; i<=num; i++)
	 {
		 if(num % i == 0)
		 {
            count++;
         }
		
	 }
	    
      System.out.println(" count : " +count);

	  if(count == 2)
	  {
		  System.out.println("The given is a prime number :" +num);
	  }

	  else {

		  System.out.println("The Given not is not a prime number : " +num);

     }
	 

	 }

}

/*   Logic 

enter no = 7

if( num % i == 0) 

{
  count ++;
}

num % i = 0

 7 % 1 = 0   --------> 1
 7 % 2 = 1
 7 % 3 = 1
 7 % 4 = 3
 7 % 5 = 2
 7 % 6 = 1
 7 % 7 = 0   ---------> 2

 */