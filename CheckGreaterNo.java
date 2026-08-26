import java.util.Scanner;

public class CheckGreaterNo{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Please Enter a first No :"); //10
     int num1 = sc.nextInt();

     System.out.print("Plese Enter a Second No :"); //30
     int num2 = sc.nextInt();

     System.out.print("Please Enter a Third No :"); //20
     int num3 = sc.nextInt();

     if(num1 > num2)
     {
        if(num1 > num3)
	 {
             System.out.println(" Num 1 is a greater :"+num1);
	 }
	 else{

             System.out.println(" Num 3 is greater :"+num3);
	 }
     
     }
     else{
         if(num2 > num3)
	 {
           System.out.println(" Num 2 is greater :" +num2);
	 }
	 else{
            System.out.println(" Num 3 is greater :" +num3); 
        }
     }

  }

}