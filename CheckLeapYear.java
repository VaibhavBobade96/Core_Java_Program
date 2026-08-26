import java.util.Scanner;
class CheckLeapYear
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Please Enter a Year:");
       int year = sc.nextInt();
       
       if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
       {
         System.out.println("This is a Leap Year :" +year);
       }
       
      else 
         {
	   System.out.println("This is a not Leap Year:" +year);
	 }
      } 
	 
   }
   
   
   // Logic 
   
   // this year is divided by 4 is leap year but not divided by 100
   // this leap year is divided by 4 , 100 or 400. this year is leap year
   
   // 4 --> yes 
   // 100 --> no 
   or
   // 400 --> yes