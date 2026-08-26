import java.util.Scanner;

public class CheckPalindrome{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

	System.out.println("Please Enter a Number :"); //   1331
	int num = sc.nextInt();
	int original = num;
	int reverse = 0;
	int rem;
   
    while(num!=0)
	    {
           rem = num % 10;   // 1) 1 2)3 3)3 4) 1
	       reverse = reverse * 10 + rem; // 1) 0 * 10 + 1 = 1 2) 2) 1 * 10 + 3 = 13 3) 13 * 10 + 3 = 133 4) 133 * 10 + 1 = 1331
	       num = num / 10; //  1)133 2) 13 3) 1
         }
	      System.out.println(" Reverse :" +reverse);
		
	
    if(reverse == original)
	{
		  System.out.println("The Given number is palindrome :"+original);
		
	}

	else {

         System.out.println("The Given Number is Not a palindrome :" +original);
	}
	 
 }

}