import java.util.Scanner;

public class StringCountSpace{

public static void main(String[] args){

 System.out.println("Please Enter a String :");

 Scanner sc = new Scanner(System.in);
 String str = sc.nextLine();

int count = 0;

for(int i = 0; i < str.length(); i++)
{
  char ch = str.charAt(i);

      if(ch == ' ')
     {
        count++;
     }

   }

   System.out.println("Total Count of Space :" +count);

 }  
 
}
