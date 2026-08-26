 import java.util.Scanner;
class FindAbsoluteValue
{
   public static void main(String[] args)
     { 
        Scanner sc = new Scanner(System.in);
	
	System.out.print("please Enter the Value:");
	int value = sc.nextInt();
	
        if(value <= 0)   //-12
	{
	   value = -value;
	   
	   System.out.println(" Absolute Value is : " + value);
	   
	}
	
	
	 }
	
	}
