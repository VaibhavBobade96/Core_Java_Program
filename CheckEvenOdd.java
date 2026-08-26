import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Please enter a number:");
     int number = sc.nextInt();
     
     if(number%2 == 0)
     {
        System.out.println(" The Number is Even: " +number);
     }
     
     else{
           System.out.println("Ther Number is Odd:" +number);
     }
  
  }

}