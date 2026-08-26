import java.util.Scanner;

class FindLargestNumber
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("please enter a First number:");
	  int num1 = sc.nextInt();
	  
	  System.out.print("please enter a second number:");
	  int num2 = sc.nextInt();
	  
	  System.out.print("please Enter a Third number:");
	  int num3 = sc.nextInt();
	  
	  if(num1>num2 && num1>num2)
	  {
	  System.out.println("Largest Number is Num1:" +num1);
	  }
	  
	  else if(num2>num1 && num2>num3)
	  {
		 System.out.println("Largest Number is num2:" +num2); 
		
	  }
	  
	  else{
		  
		  System.out.println("Otherwise the largest number is num3:" +num3);
	  }
	  
	  
	}
	
}