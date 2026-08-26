import java.util.Scanner;

class Calculator
{
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first Number :");
	double num1 = sc.nextDouble();
	
	System.out.print("Enter a Operator +, -, *, /, % :");
	char op = sc.next().charAt(0);
	
	System.out.print("Enter a second number :");
	double num2 = sc.nextDouble();
	
	
	switch(op)
	 {
	    case '+' :
	    System.out.println("Result : " + (num1 + num2));
	    break;
	    
	    case '-':
	    System.out.println("Result : " + (num1 - num2));
	    break;
	    
	    case '*' :
	    System.out.println("Result : " + (num1 * num2));
	    break;
	    
	   case '/':
	   if(num2 != 0)
	   {
	      System.out.println("Result : " + (num1 / num2)); 
	    }
	    
	    else 
	        
		System.out.println(" Division By Zero is not allowed  ");
		
		break;
		
	   
	    case '%' :
	    if(num2 != 0)
	    {
		System.out.println(" Result : " + (num1 % num2));
	    }
	    else
	     
		System.out.println(" modulo by zero is not allowed" );
	    
	  }
	
	}
	
}