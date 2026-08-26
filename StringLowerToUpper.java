import java.util.Scanner;

public class StringLowerToUpper{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter a String :");
String str = sc.nextLine();

String result  = str.toUpperCase();

System.out.println("To Uppercase String :" +result);

  }

}