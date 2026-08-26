import java.util.Scanner;

public class FindFirstAndLastNo{

     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

	 System.out.print("Please enter a number:");  // 1234
	 int num = sc.nextInt();

	 int LastNo = num % 10;
	 int FirstNo = num;

	  while(FirstNo >= 10)
	   {
         FirstNo = FirstNo / 10;
	       
	   }
        
		
	    System.out.println("First Number :" +FirstNo);
	    System.out.println("Last number :" +LastNo);
	  
	  

	   }

	 
  }

   

	   