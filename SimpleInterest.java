import java.util.Scanner;

class SimpleInterest 
{
  public static void main(String[] args)
  { 
    Scanner sc = new Scanner(System.in);
    System.out.print("please enter principal amount:");
    int principal = sc.nextInt();
    System.out.print("please enter a rate of interest:");
    int rate = sc.nextInt();
    System.out.print("Please enter a time (in years):");
    int time = sc.nextInt();
    
    int SI = principal * rate * time / 100;
    
    System.out.println("Simple Interest is :" +SI);
    
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  //  Simple Interest Formula = P * R * T / 100;