import java.util.Scanner;

public class CheckPrime3{
 
  public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("please enter a num:");
     int num = sc.nextInt();
     
     int count=0;

     for(int i=2; i<num; i++)
     {
       if(num%i == 0)
       {
          count++;

       } 
      
      }

      if(count == 0)
      {
        System.out.println("The given number is a prime number :" +num);
      }

      else {
         System.out.println("The given number is not a prime number:" +num);
      }

   }

}