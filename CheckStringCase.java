import java.util.Scanner;

class CheckStringCase
{
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please Enter a String:");
	String str = sc.nextLine();
	
	if(str.equals(str.toUpperCase()))
	{
	   System.out.println(str +" Uppercase String");
	}
	
	else if(str.equals(str.toLowerCase()))
	{
	   System.out.println(str +" lowercase String");
	   
	}
	else {
		System.out.println("String is both uppercase and lowercase");	
	}
	
     }
     
  }