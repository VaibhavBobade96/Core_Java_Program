import java.util.Scanner;

class CheckVotingEligibility
{
  public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Please enter the Age :");
       int age = sc.nextInt();
       
       if(age >= 18)
       {
          System.out.println("yes, you are eligible for voting:");
       }
       
       else {
       
          System.out.println("No, you are not eligible for voting:");
       }
       
    }
    
   }