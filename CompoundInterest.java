import java.util.Scanner;

class CompoundInterest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Please enter a principal amount:");
    int P = sc.nextInt();
    
    System.out.print("Please enter a rate of interest:");
    int R = sc.nextInt();
    
    System.out.print("please enter a time (in yers):");
    int T = sc.nextInt();
    
    int SI = P * R * T / 100;
    
    System.out.println(" Simple Interest :" +SI);
    
    int Amount = P + SI;
    
    System.out.println("Total Amount :" +Amount);
    
    int CI = Amount - P;
    
    
    System.out.println("Compound Interest :" +CI);2
    
       }
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
   // Simple Interest = P * R * T / 100  
   // Amount = Princiapal + SI
   // Compound Interest Formula = Amount - Principal