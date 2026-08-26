import java.util.Scanner;

public class TwoNoDiffPositiveOrNeg{

  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("Please Enter a number :");
     int num1 = sc.nextInt();

     System.out.print("Please Enter a Second No:");
     int num2 = sc.nextInt();

     int difference = num1 - num2;

     if(difference >= 0)
     {
       System.out.println("The given number difference is :" +difference+ " difference is positive");
     }
     else {
       System.out.println("The given number difference is :" +difference+ " difference is Negative");
     }

   }
 
}