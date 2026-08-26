import java.util.Scanner;

class FindAbsoluteValue2
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Please Enter a Value :");
      int num = sc.nextInt();
      
     int absolute_value = Math.abs(num);
      
      System.out.println(" Absolute value is : " +absolute_value);
      
      }
      
 }