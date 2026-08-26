class Array
{
  public static void main(String[] args)
   {  
	  //creating array object with value
      int[] i = {10, 20, 30, 40, 50};
	  
	  
	  //printing array object
	  //array values are not printed
	  //its type referenced is printed
	  //for printing array values, we must access each location individually by its index
	  System.out.println(i); //  [I@372f7a8d
      
	  
	  //printing array object values
      System.out.println(i[0]);
	  System.out.println(i[1]);
	  System.out.println(i[2]);
	  System.out.println(i[3]);
	  System.out.println(i[4]);
	  System.out.println(i[5]);
	  
	  System.out.println(i[6]);    // RE : Index 5 out of bounds for length 5
	  System.out.println(i[-3]);
	  
      
    }
    
}