import java.util.Scanner;

public class CompareString{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter a String 1 :");
String str1 = sc.nextLine();

System.out.println("Please Enter a String 2 :");
String str2 = sc.nextLine();

if(str1.equals(str2))
{
  System.out.println(" Both Strings are Equals ");
 }
 else {
   System.out.println(" Both Strings are not Equals ");
  }

  }

}

