import java.util.Scanner;

public class CheckCharUpperOrNot{
  
   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter a charecter:");
   char ch = sc.next().charAt(0);

   if(ch >= 'A' && ch <= 'Z')
    {
       System.out.println("The give charecter is upper case :"+ch);
    }

   }

}
      

   