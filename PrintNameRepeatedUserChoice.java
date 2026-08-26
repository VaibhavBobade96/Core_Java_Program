import java.util.Scanner;

public class PrintNameRepeatedUserChoice{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   System.out.print("Please enter a Your name:");
   String name = sc.next();

   System.out.println("How many time you want to print the name Enter the digit :");
   int digit = sc.nextInt();

   for(int i = 1 ; i <= digit ; i++)
   {
     System.out.println(i+" "+name);
   }

   }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
  
  }
 