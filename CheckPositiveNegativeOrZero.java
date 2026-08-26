import java.util.Scanner;
class CheckPositiveNegativeOrZero
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please Enter a Number:");
    int Number = sc.nextInt();
    
    if(Number>0)
    {
      System.out.println("Number is Positive :" +Number);
    }
    
    else if(Number < 0)
    {
      System.out.println("number is Negative:" +Number);
    }
    
    else{
        System.out.println("number is Zero:" +Number);
    }
  }
  
}