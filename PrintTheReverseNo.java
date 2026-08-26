import java.util.Scanner;

public class PrintTheReverseNo{

  public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.print("please Enter a number :");
  int num = sc.nextInt();

  do{

      System.out.println(num);
      num --;

    } while(num >= 3);

    }

  }