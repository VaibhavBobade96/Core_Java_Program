import java.util.Scanner;

class FindMinimum
{
    public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the value of a :");
      int a = sc.nextInt();
      
      System.out.print("Enter the value of b :");
      int b = sc.nextInt();
      
      int min = (a < b) ? a : b;
                
      System.out.println("Minimum Value :" +min);
      
      }
      
   }
      