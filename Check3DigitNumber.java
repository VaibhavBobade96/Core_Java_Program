import java.util.Scanner;

public class Check3DigitNumber{

   public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);

      System.out.println("Please enter a number :");
      int num = sc.nextInt();

      if(num >= 100 && num <= 999)
      {
        System.out.println("the give number is 3 Digit :" +num);
      }

   }

 }