import java.util.*;

public class CheckEvenOrOddUsingFunction{

  static void check(int num )
  {
    
   System.out.println("please enter a number : ");
   Scanner sc = new Scanner (System.in);

    num = sc.nextInt();

   if(num % 2 == 0)
   {
     System.out.println("The Given Number is Even :" +num);
    }

    else
    {
       System.out.println("The Given Number is Odd :" +num);

    }

 }

 public static void main(String[] args){

    check(0);

  }

}
