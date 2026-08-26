import java.util.Scanner;

class ProfitAndLoss
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("please Enter a Cost Price :");
      int CostPrice = sc.nextInt();
      
      System.out.print("please Enter a Selling Price :");
      int SellingPrice = sc.nextInt();
      
      double profit = 0;
      double loss = 0;
      
      if( SellingPrice > CostPrice)
      {
          profit = SellingPrice - CostPrice;
	  System.out.println(" Profit : " + profit);
      
      }
      else if( CostPrice > SellingPrice )
      {
	   loss = CostPrice - SellingPrice;
           System.out.println(" Loss :" +loss);
      
      }
	  
	  else {
		  
		 System.out.println(" Not Profit and Loss ");  
	  }
  
  }
    
	
}