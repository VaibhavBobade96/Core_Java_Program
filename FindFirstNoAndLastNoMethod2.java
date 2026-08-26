import java.util.Scanner;

public class FindFirstNoAndLastNoMethod2{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

	System.out.print("please Enter a number :");
	int num = sc.nextInt();
    int rem=0;
	int reverse = 0;

	int LastNo = num % 10 ;
    System.out.println(" last Number = " +LastNo);

	while(num!=0)
	{
	   rem = num % 10;
	   reverse = reverse * 10 + rem;
	   num = num / 10;	    

	 }
	  System.out.println("First Number = " +rem);
	 
     
    }

  }