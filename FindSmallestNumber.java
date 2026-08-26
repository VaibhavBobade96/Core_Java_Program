import java.util.Scanner;

class FindSmallestNumber
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("please Enter the First Number:" );
    int num1 = sc.nextInt();
    
    System.out.print("please Enter the Second Number:");
    int num2 = sc.nextInt();
    
    System.out.print("Please Enter the third Number:");
    int num3 = sc.nextInt();
    
    
    if (num1<num2 && num1<num3)
    {
       System.out.println("Smallest Number is num1:" +num1);
    
    }
    
    else if (num2<num1 && num2<num3)
       {
       
          System.out.println("Smallest Number is num2:" +num2);

       }
       
     
     else{
            System.out.println("The Smallest Number is :" +num3);
     }


}

}