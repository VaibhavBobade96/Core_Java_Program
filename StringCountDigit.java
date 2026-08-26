import java.util.Scanner;

public class StringCountDigit{

 public static void main(String[] args){

  Scanner sc = new Scanner(System.in);
  
  int count = 0;

  System.out.println("Please Enter a String :");
  String str = sc.nextLine();

  for(int i = 0; i < str.length(); i++)
  {
     char ch = str.charAt(i);
   
     if( ch >= '0' && ch <= '9')
     { 
         
	    count++;
 
      }

   }

  System.out.println("Count The Digit :" +count);


  }

}