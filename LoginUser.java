import java.util.Scanner;

public class LoginUser{

  public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Please Enter a Register Number :");
	  int reg = sc.nextInt();

	  if(reg == true)
	   {
         System.out.println("Register Successfully.....");
		 System.out.println("You are Eligible for Login ")

		 System.out.println("Please Enter a User Name :");
		 String username = sc.next();

		 System.out.println("Please Enter a Password ");
		 String password = sc.next();

		 if(username.equals("Admin") && password.equals("admin123")
		   {
              System.out.println("login Successful ");
			
		   } 
         else {

              System.out.println("login failed");
		 }


	   }
	   else{

            System.out.println("Please create your Account first");
	   }

   }



