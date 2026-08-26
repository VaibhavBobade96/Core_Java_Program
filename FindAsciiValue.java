import java.util.Scanner;
class FindAsciiValue
{
   public static void main(String[] args)
   {  
	Scanner sc = new Scanner(System.in);
	
	System.out.print("please enter a charecter:");
	char ch = sc.next().charAt(0);
	
	int value = ch;
	
	System.out.println("Ascii Value:" +value);
	
	}
	
}

