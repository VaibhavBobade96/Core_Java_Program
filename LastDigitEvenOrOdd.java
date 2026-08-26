import java.util.Scanner;

public class LastDigitEvenOrOdd{
   
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number ");  // 1943
      int num = sc.nextInt();
	  int rem;

      if(num > 0)
      {
        rem = num % 10 ;

	 if(rem % 2 == 0)
	 {
           System.out.println("The Last digit of the number is even :" +rem);
	  
	 }

	 else{
           System.out.println("The Last digit of the number is odd :" +rem);
	 }

	 }
	}
}