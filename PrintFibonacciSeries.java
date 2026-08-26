import java.util.Scanner;

public class PrintFibonacciSeries{

    public static void main(String[] args)
      {

         Scanner sc = new Scanner(System.in);

	 System.out.print("Please enter a number :"); //10
	 int num = sc.nextInt();

	int  firstno = 0;
	int  secondno= 1;

	System.out.println(firstno);
	System.out.println(secondno);
	
	for(int i=1; i<=num; i++)
	{
		int next = firstno + secondno;                    // logic     f  s   n
		firstno = secondno;                               //           0  1   1   2   3   5   8  13    21   
		secondno = next;                                  //              f   s   n
		
		System.out.println(next);
		                                  
	}
	 

	  }

  }