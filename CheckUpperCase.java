import java.util.Scanner;

class CheckUpperCase{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Please enter a = ");
	char ch = sc.next().charAt(0);
	
	if((ch >= 'A' && ch <= 'Z'))
	{
	   System.out.println(ch +" charecter is uppercase");	   
	}
	
	else if((ch >= 'a' && ch <= 'z'))
	{
		System.out.println(ch + " charecter is lowercase");
	}
	
	else{
		System.out.println(ch + " charecter is special symbol");
	
	}
	
}

}