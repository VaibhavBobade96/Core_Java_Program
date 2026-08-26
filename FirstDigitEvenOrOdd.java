import java.util.Scanner;

public class FirstDigitEvenOrOdd{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);  
     System.out.print("please enter a number :"); // 76 3 4 5
     int num = sc.nextInt();
     int original = num;

     while(num > 10) 
	 {
	  num = num / 10; // 7634 --> 763 -->76 -->7
     }

     if(num % 2 == 0)
     {
        System.out.println("The give number first digit is even :"+num);
     }
     else
     {
       System.out.println("The given number is first digit is odd :" +num);
     }
  }

}