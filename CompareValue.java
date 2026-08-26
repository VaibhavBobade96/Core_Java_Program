import java.util.Scanner;

public class CompareValue{
    public static void main(String[] args)
      {
        Scanner sc = new Scanner(System.in);

	System.out.print("Please enter a first no :");
	int num1 = sc.nextInt();

	System.out.print("Please Enter a Second no:");
	int num2 = sc.nextInt();

	System.out.print("please enter a third no :");
	int num3 = sc.nextInt();

	if(num1 > num2 && num1 > num3 )
	{
           System.out.print(" Num1 is greater no :");
	}

	else if(num2 > num1 && num2 > num3)
	{
            System.out.println(" Num2 is greater ");
	}

	else if(num3 > num2 && num3 > num2)
	{

            System.out.println("num3 is greater number :");
	}

	else{

          System.out.println("All numbers are same");

	}

	}

}