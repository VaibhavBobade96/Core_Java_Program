import java.util.Scanner;

class MenuDrivenCalculator
{
   public static void main (String[] args)
  {
   Scanner sc = new Scanner(System.in);
   
   System.out.println(" 1. Addition ");
   System.out.println(" 2. Substraction ");
   System.out.println(" 3. Multiplication ");
   System.out.println(" 4. Division ");
   
    System.out.print(" Please Enter a choice :");
   int choice = sc.nextInt();
   
   
   System.out.print(" Please Enter a first no : ");
   int num1 = sc.nextInt();
   
   System.out.print(" Please Enter a Second no : ");
   int num2 = sc.nextInt();
    
   
   switch(choice)
   {
      case 1 :
      System.out.println(" Addition : " +(num1 + num2));
      break;
      
      case 2 :
      System.out.println(" Substraction : " +(num1 - num2));
      break;
      
      case 3 :
      System.out.println(" Multiplication : " +(num1 * num2));
      break;
      
      case 4 : 
      System.out.println(" Division : " +(num1 / num2));
      break;
      
     
      
      
      }
      
   }
      
      
   }
   
   
   
   
   
   