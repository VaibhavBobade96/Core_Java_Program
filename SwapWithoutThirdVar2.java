import java.util.Scanner;

public class SwapWithoutThirdVar2{
   
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a val1 :"); // 50 
	int val1 = sc.nextInt();

	System.out.print("Please Enter a val2 :"); // 30
	int val2 = sc.nextInt();

    val1 = val1 + val2; // 50 + 30 = 80
	val2 = val1 - val2; // 80 - 30 = 50
	val1 = val1 - val2; // 80 - 50 = 30
	

	System.out.println("val1 = "+val1); 
	System.out.println("val2 = "+val2);

	}

}