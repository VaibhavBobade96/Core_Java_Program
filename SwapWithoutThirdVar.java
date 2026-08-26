class SwapWithoutThirdVar
{ 
   public static void main(String[] args)
    { 
       int num1 = 10;
       int num2 = 20;
       
       System.out.println("Swapping Without Third Number");
       System.out.println();
       System.out.println("Before Swapping");
       System.out.println("Num1 =" +num1);
       System.out.println("Num2 =" +num2);
       
       System.out.println("\nAfter Swapping");
       
       num1 = num1 + num2;    //  num1=10+20    ans num1 = 30
       num2 = num1 - num2;    //  num2=30-20    ans num2 = 10
       num1 = num1 - num2;    //  num1=30-10    ans num1 = 20
	   
	   System.out.println("Num1 =" +num1);
	   System.out.println("Num2 =" +num2);
       
       }
       
   }
       