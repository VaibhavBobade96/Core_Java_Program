import java.util.Scanner;

public class FindTheDuplicatecharInString{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("Please Enter a String :");
String str = sc.nextLine();     // vaibhav

int count;

for(int i = 0; i < str.length(); i++)
{
   count = 0;

 for(int j = 0; j < str.length(); j++)
  {
     if(str.charAt(i) == str.charAt(j))
     { 
	   count++;
     }

  }

     if (count > 1)
     {
	    System.out.println("Duplicate Charecter :" +str.charAt(i));
     }
   }

  }

}
        
