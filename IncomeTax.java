import java.util.Scanner;

class IncomeTax 
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
	
	System.out.println("Please Enter a Anual Income :");
	double income = sc.nextDouble();
	
	double tax ;
	
	if(income <= 25000)
	{
	   tax = 0;
	 
	}

        else if(income <= 50000)
	{
	   tax = income * 0.5;
	
	}
	
	else if(income <= 100000)
	{
	   tax = income * 0.10;
	}
	
	else {
		tax = income * 0.20;
	}
	
	System.out.println("Income Tax :" + tax);
	
	}
	
     }
      