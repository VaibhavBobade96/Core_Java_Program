import java.util.Scanner;

public class SalaryAccordingBonus{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("please enter a Salary :");
    float salary = sc.nextFloat();
    float bonus;
	float TotalSalary;
    
    if(salary <= 20000)
    {
       bonus = salary * 0.20f;
       System.out.println("Salary bonus is 20 % :" +bonus);
       
	   TotalSalary = bonus + salary;

	   System.out.println("Total salary is :" +TotalSalary);
	   
    }

	else if( salary <= 40000)
	  {
		bonus = salary * 0.10f;
		System.out.println("Salary bonus is 10 % :" +bonus);
		
		TotalSalary = bonus + salary;

		System.out.println("Total Salary is :" +TotalSalary);
	  }

	 else {
             bonus = salary * 0.05f;
			 System.out.println("Salary bonus is 5 %:" +bonus);

			 TotalSalary = bonus + salary;

			 System.out.println("Total Salart is :" +TotalSalary);
	 }

  }
}