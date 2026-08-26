import java.util.Scanner;

public class StringCountVowels{

  public static void main(String[] args){
 
   System.out.print("Please Enter a String:");
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();  // Vaibhav
   int count = 0;

   
   for(int i = 0; i < str.length(); i++)
   {
      char ch = str.charAt(i); 

     if(ch >= 'a' && ch <= 'z' || ch > 'A' && ch < 'Z')
     {
       if(ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'e')
       {
          count++;
       }
     }

 

  }

   System.out.println(+count);
  }

}