import java.util.*;

public class CheckLeapYearUsingIf{

  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter a Year:");
    int year = sc.nextInt();

    if(year % 400 == 0 || (year % 4 == 0  && year % 100 != 0))
    {
      System.out.println("The given year is  a leap year :" +year);
    }

   }

 }