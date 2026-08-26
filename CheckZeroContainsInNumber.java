import java.util.Scanner;

public class CheckZeroContainsInNumber{
public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter a Digit : "); //89034
   int dig = sc.nextInt();

   while(dig > 0)
   {
     int rem = dig % 10; // 4

     if(rem == 0)
      {
       System.out.println("The give number contains the 0");
       break;

    }

     dig = dig/10;

   
    }

   }

 }



      




