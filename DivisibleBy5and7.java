import java.util.Scanner;

class DivisibleBy5and7
{
   public static void main(String[] args){
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println(" Please Enter a Number:");
       int num = sc.nextInt();
       
       if(num % 5 ==0  && num % 11 == 0)
       {
	   System.out.println(" Number are divisible by both 5 and 11" + num);
	   
	}
	
	else{
		System.out.println(" Number are not divisible by 5 and 11 " +num);
	
	}
	
   }
}