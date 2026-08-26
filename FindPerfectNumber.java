import java.util.Scanner;

public class FindPerfectNumber{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

	System.out.print("Please enter a number :"); // 6
	int num = sc.nextInt();
	int original = num;
	int sum = 0;

        for(int i = 1; i < num ; i++)
	       {
             if(num%i == 0)
		      {
                 sum = sum + i ; // 0+1 = 1 --> 1+2 = 3 --> 3 + 3 = 6 --> 
				
		       }
	        }    
           System.out.println(" The sum of all divisors :" +sum);

		if(original == num)
		{
           System.out.println(" The Given Number is Perfect Number :" +num);
		}

		else{
           System.out.println(" The Given Number is Not a Perfect Number :" +num);
		}
		
	}

   }