
class FunctionExample{

 public static void main(String[] args){

   
  addition();

  FunctionExample obj1 = new FunctionExample();
  obj1.multiplication();

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

}