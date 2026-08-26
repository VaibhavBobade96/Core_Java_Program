class EmptyLine
{
  public static void main(String[] args)
  {
     System.out.println("Hi");
     System.out.println();           // Printing Empty Line 
     System.out.println(" ");         // Printing Empty Line
     System.out.println("Hello");
     
     System.out.print("Hi");
   //  System.out.print();          // Compile Time Error Occur
     System.out.print(" ");         // not occur Empty line
	 System.out.print("\n");        // Printing Empty Line These Statement is valid
     System.out.print("\nHello\n");
     
     }
     
  }