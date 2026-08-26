import java.util.Scanner;

public class CompareString2{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Please enter a string 1 :");  // vaibhav
String str1 = sc.nextLine();

System.out.println("Please Enter a String 2 :");  //vaibhav
String str2 = sc.nextLine();

boolean same = true;

if(str1.length() != str2.length())
{
   same = false;

}
else{

    for(int i = 0; i < str1.length(); i++)
    {
      if(str1.charAt(i) != str2.charAt(i))
      {
        same = false;
	    break;
      }
    }

}

if(same)
 {
   System.out.println(" The String are same ");
  }

  else {
    
    System.out.println(" The string are not same ");
  
 
 }

}
  
}