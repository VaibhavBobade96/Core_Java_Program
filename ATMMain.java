import java.util.Scanner;
class ATM {

   double balance;

   void withdraw(double amount)
   {
     if(amount <= balance)
     {
       double Total_Balance = balance - amount;
       
       System.out.println("balance :" + Total_Balance);
	   System.out.println("Withdrawal Successfully....");

     }
      else{
          System.out.println("insuficient balance....");
      }
   
   }

}

   class ATMMain{

      public static void main(String[] args){

	  System.out.println("Please Enter the amount :" );

	  Scanner sc = new Scanner(System.in);
	  double amount = sc.nextDouble();
      ATM a1 = new ATM();
      
	  a1.withdraw(amount);

     // a1.withdraw();

      }

  }