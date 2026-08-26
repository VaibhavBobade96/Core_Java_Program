import java.util.Scanner;

class CheckVowelsOrConsonant
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("please enter the charecter:");
       char ch = sc.next().charAt(0);
       
       if( (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) || (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'))
       {
		System.out.println("Vowel :" + ch);
       }
       
       else {
       
		System.out.println("Consonant :" + ch);
       }
	}
   
	}