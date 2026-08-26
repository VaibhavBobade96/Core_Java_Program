import java.util.Scanner;

public class DivisibleByBoth3And5{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("Please Enter a Number :");
     int num = sc.nextInt();

     if(num%3==0 && num%5==0)
     {
        System.out.println("The given number is divisible by both 3 and 5 :" +num);
     }

   }

 }