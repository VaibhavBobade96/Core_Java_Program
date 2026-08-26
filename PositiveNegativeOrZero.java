import java.util.Scanner;

public class PositiveNegativeOrZero{

  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);

    System.out.print("please enter a no:");
    int num = sc.nextInt();

    if(num > 0)
    {
       System.out.println("The given number is positive :"+num);
     }

     else if(num < 0)
     {
       System.out.println("The given number is negative "+num);
     }

     else{
        System.out.println("The given number is zero :"+num);
     }

     }

   }
  