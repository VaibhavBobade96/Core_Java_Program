import java.util.Scanner;

public class CalculatorUsingSwitchCase{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.println("Please Enter Value 1 :");
 int a = sc.nextInt();

 System.out.println("Please Enter Value 2 :");
 int b = sc.nextInt();

 System.out.println(" 1. + ");
 System.out.println(" 2. - ");
 System.out.println(" 3. * ");
 System.out.println(" 4. / ");

 System.out.println("please enter a operator: ");
 char op = sc.next().charAt(0);


   switch(op)
	{
case '+':
   System.out.println("Addition of a and b is :" +(a + b));
   break;

case '-':
   System.out.println("Substraction of a and b is :" +(a - b));
   break;

case '*' :
   System.out.println("Multiplication of a and b is :" +(a * b));
   break;

case '/':
   System.out.println("Division of a and b is :" +(a / b));
   break;

   default :
     System.out.println(" Invalid Operator ");
   
   }

 }

}