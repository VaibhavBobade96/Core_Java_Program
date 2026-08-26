class main{

 public static void main(String[] args){

   
  addition();

  main ob = new main();
  ob.multiplication();
  ob.division(2.3, 1.3);
  System.out.println((ob.display))
  

 }


 static void addition()  // static method  1. automatically allocate a memory and no need to object for calling function
 {
    int a = 10; 
    int b = 20;
    int c = a + b;

    System.out.println(" Addition of a and b : " + c);
 }

 void multiplication()
	{
	  int a = 10;
	  int b = 20;
	  int mult = a * b;
	  System.out.println(" Multiplication of a and b :" +mult);
	}


  String display()
  {
  
     return "Fortune Cloud";
  }


  Void division(double a, double b)
	{
	   
	  System.out.println("Division of a and b :" +(a/b));

	
    }
   
}