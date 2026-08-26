class SwapWithThirdVar
{
  public static void main(String[] args)
    {
      int val1 = 10;
      int val2 = 20;
      int Temp;
      
      System.out.println("Swapping two Number With Third variable =" );
      
      System.out.println("Before Swapping.."); 
      System.out.println("value 1 =" +val1);
      System.out.println("value 2 =" +val2);
      
	 // System.out.println();
	 
	  Temp = val1;
      val1 = val2;
      val2 = Temp;
      
      
      System.out.println("\nAfter Swapping..."); 
      System.out.println("value 1 =" +val1);
      System.out.println("value 2 =" +val2);
      
      }
      
  }