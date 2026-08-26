import java.util.Scanner;
class FindSquare
{
  public static void main(String[] args)
   { 
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a number=");
      int num = sc.nextInt();
      
      int square = num * num;
      System.out.println("Number is : " +num);
      System.out.println("Square of number =" +square);
      }
      
   }