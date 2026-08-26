import java.util.Scanner;

public class CheckStringPalindrome{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter a String :");
String str = sc.nextLine();

String reverse = "";

 for(int i = str.length()-1; i >= 0; i--)
   {
      reverse = reverse + str.charAt(i);
   }

   if(reverse.equals(str)) 
   {
     System.out.println("The String Is Palindrome :" +reverse);
   }
   else {
     System.out.println("The String Is Not a Palindrome :"+reverse);
   }


  }

}


