import java.util.Scanner;

public class FindTheStrongNumber{

    public static void main(String[] args)
    {
   
      Scanner sc = new Scanner(System.in);

      System.out.print("please enter a number :"); // 154
      int num = sc.nextInt();
      int original = num;
      int sum = 0;

      while(num != 0)
      {  

         int rem = num % 10 ; // 4 --> 5 --> 1 
		 int fact = 1;

	 for(int i = 1; i <= rem; i++)
	   {

        fact = fact * i  ;  // 1 --> 2 --> 6 --> 24  2)120
		
	   }
	    sum = sum + fact; // 24 + 120 = 144
        num = num / 10; // 15

      }

      System.out.println(" The num Value at the end =" +num);
      System.out.println(" The Original value given to the user :" +original);
      System.out.println(" The Sum or all factorial :" +sum);

	  if(original == sum)
	  {
		   System.out.println(" The given Number is Strong Number " +sum);
	  }

	  else{
            System.out.println(" The Given Number is Not a Strong Number : " +sum);
	    }

      }

    }





         
