import java.util.Scanner;

public class CheckFirstDigit{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("please enter a number :");  // 7789
    int num = sc.nextInt();
    
    int first = num ;  // 7 7 8 9

   while(first >= 10)
   {
     first = first/10;
   }
   
   if(first == 7)
   {
     System.out.println("The given no first digit is 7");
   }

 }

}
    


    