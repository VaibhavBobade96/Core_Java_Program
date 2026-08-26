import java.util.Scanner;

public class CheckVowel{

  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("please enter a charecter:");
     char ch = sc.next().charAt(0);

     if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' ||
	    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')

     {
         System.out.println("The charecter is vowel  :"+ch);
     } 

  }

}
