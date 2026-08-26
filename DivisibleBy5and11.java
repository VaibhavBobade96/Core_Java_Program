import java.util.Scanner;

public class DivisibleBy5and11{

  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("please enter a number :");
     int num = sc.nextInt();

     if(num % 5 == 0 && num % 11 == 0)
     {
        System.out.println("The given number is divisible by 5 and 11 :" +num);
     }

     else{
        System.out.println("The given number is not divisible by 5 and 11 :" +num);
    }

  }

}
