import java.util.Scanner;

public class PositiveEven{

   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
	  System.out.print("please Enter a number:");
      int num = sc.nextInt();

      if(num > 0)
      {
         if(num % 2 == 0)
	    {
           System.out.println("positive Even :" +num);
	    }

	     else{
           System.out.println("positive odd :" +num);
	     }
	
      }else{

		  if(num < 0)
		  {
             System.out.println("Negative Even :"+num); 
		
		  }else{

             System.out.println("Negative Odd :"+num);
		  }
		  
	  }

  }
  
}

