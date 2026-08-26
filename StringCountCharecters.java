import java.util.Scanner;

public class StringCountCharecters{

public static void main(String[] args){

 System.out.println("Please Enter a String:");
 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();
 int count = 0;

 for(int i = 0; i < str.length(); i++)
 {
   count++;

 }

 System.out.println("Total Array Element Count is :" +count);

  }

}

