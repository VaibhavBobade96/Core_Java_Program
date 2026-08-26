import java.util.Scanner;

class SumOfFirstNumbers{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
	
	System.out.print(" Please enter a number: ");
	int number = sc.nextInt();
	
	
	int sum = 0;
	
        for(int i = 1; i <= number ; i++)
	{
	   sum = sum + number;
	    
	 }
	 
	 System.out.println(sum);
	 
	}
	
}
