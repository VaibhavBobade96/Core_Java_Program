import java.util.Scanner;

public class CheckLastDigit{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("please enter a number for checking a last digit :" );  //1234
    int num = sc.nextInt();

    if(num % 10 == 4)
    {
      System.out.println(" The last digit of Number is 4 ");
    } 
}

}