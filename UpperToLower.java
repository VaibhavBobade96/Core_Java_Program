import java.util.Scanner;

public class UpperToLower{

public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  System.out.println("Please Enter a String :");
  String str = sc.nextLine();

  String result = str.toLowerCase();

  System.out.println("String in Lower Case :" +result);

  }

}

