import java.util.*;

public class StringCountConsonants{

public static void main(String[] args){

System.out.println("Please Enter a String :");

Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

int count = 0;

for(int i = 0; i < str.length(); i++)
{
  
  char ch = str.charAt(i);

  if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
	{
      if(ch != 'a'  && ch != 'i' && ch != 'o' && ch != 'e' && ch != 'u' && ch != 'A' && ch != 'I' && ch != 'E' && ch != 'O' && ch != 'U' )
       {
          count ++;
        }
	}
}

System.out.println(count);

}

}

