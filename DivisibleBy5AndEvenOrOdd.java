import java.util.Scanner;

public class DivisibleBy5AndEvenOrOdd{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter a number :");
    int num = sc.nextInt();

    if(num % 5 == 0)
    {
      if(num % 2 == 0)
      {
        System.out.println("The Given Number is Divisible by 5 and Even number :"+num);
      }
      else{
        System.out.println("The given number is divisible by 5 and odd number :"+num);
      }

	}
    else{
       System.out.println("The given number is Not Divisible by 5 :" +num);
    }

 }


}