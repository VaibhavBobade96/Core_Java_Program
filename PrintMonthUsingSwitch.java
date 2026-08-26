import java.util.Scanner;

public class PrintMonthUsingSwitch{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Please Enter a 1 - 12 any digit for identifying the month.......");
int digit = sc.nextInt();

switch(digit)
{
  case 1:
    System.out.println("january");
    break;
  
  case 2:
     System.out.println("february");
     break;

  case 3:
     System.out.println("March");
     break;

  case 4:
     System.out.println("April");
     break;

  case 5:
      System.out.println("May");
      break;
  
  case 6:
       System.out.println("june");
       break;

  case 7:
       System.out.println("jaly");
       break;

  case 8: 
       System.out.println("August");
       break;

  case 9:
       System.out.println("September");
       break;

  case 10:
       System.out.println("Actomber");
       break;

  case 11:
       System.out.println("November");
       break;

  case 12:
       System.out.println("December");

  default:
       System.out.println("Invalid Digit");
      
     }

  }

}