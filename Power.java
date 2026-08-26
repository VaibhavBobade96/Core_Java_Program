import java.util.Scanner;

public class Power{
    
     public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
	 
	 System.out.println("please enter a base value :");
	 int base = sc.nextInt();

	 System.out.println("Please enter a power value:");
	 int pow = sc.nextInt();

	 int result = 1; 

	 for(int i=1; i<=pow; i++)
	 {
            result = base * result;
	 }

	 System.out.println(" The base value" +base+ "and power value " +pow+ "and result =" +result);

	 }

}


