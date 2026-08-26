import java.util.Scanner;

class ElectricityBill
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Type of Electricity Bill :");      
      System.out.println("1. Domestic ");
      System.out.println("2. Commercial ");
      
      
      System.out.print("Please Enter a type :");
       int type = sc.nextInt();
       
       
      System.out.print("Please Enter a Unit :");
      int unit = sc.nextInt();
      
      double bill = 0;
      
      switch(type)
      {
         case 1 :
	 bill = unit * 5;
         System.out.print("Domestic Bill :" +bill);
	 break;
	 
	 case 2 : 
	 bill = unit * 10;
	 System.out.print("Commercial Bill :" +bill);
	 break;
	 
	 default : 
		System.out.println(" invalid domestic type :");
		
	   }
	   
	}
	
	
  }
	 