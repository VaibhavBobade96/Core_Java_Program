import java.util.Scanner;

public class CountDigitsMethod2{

        public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);

	    System.out.print("Please enter a number:");
            int num = sc.nextInt();

	    int count = 0;

	    if(num!=0)
	    {

			for(; num!=0 ; count++)

			num = num / 10;
	       
	    }
		System.out.println(count);

	 }

	    

	   

  }
