import java.util.Scanner;

public class SimpleATM{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println(" 1. Check Balance ");
System.out.println(" 2. Deposit ");
System.out.println(" 3. Withdrawal ");
System.out.println(" 4. Exit " );


System.out.println("Please enter your choice :");
int choice = sc.nextInt();

 double balance = 10000;

switch(choice)
{
  case 1 :
        System.out.println("Current Balance :" +balance);
	break;

  case 2 :
	System.out.println("Enter Deposit amount :" );
	double deposit = sc.nextDouble();

	balance = balance + deposit;

	System.out.println("Amount Deposited :" +deposit);
	System.out.println("Updated Balance :" +balance);

	break;
 
 case 3:
	System.out.println("Enter Withdrawal amount :" );
	int withdrawal = sc.nextInt();

	if(withdrawal <= balance)
	{
	  balance = balance - withdrawal;
	  System.out.println("Withdrawal Amount :" +withdrawal);

	  System.out.println("Updatede balance is :" +balance);
	}

	else {
          System.out.println("Insufficient Balance");
	   }

 case 4 :
	System.out.println(" Thanking for Yousing ATM ");
	break;

default : 
        System.out.println(" Invalid Choice ");

     }

 }

}
