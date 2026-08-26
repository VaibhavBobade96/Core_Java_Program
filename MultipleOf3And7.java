import java.util.Scanner;

class MultipleOf3And7
{ 
   public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Please Enter a Number :");
       int num = sc.nextInt();
       
       if(num % 3 == 0 && num % 7 == 0)
       {
	   System.out.println(" The Number is Multiply by 3 and 7 ");
       }
       
       else{
       
	   System.out.println(" The Number is Not Multiply by 3 and 7 ");
       }
    
     }
	 
}