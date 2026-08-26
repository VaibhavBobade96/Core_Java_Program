import java.util.Scanner;

class FindMaximum
{ 
   public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Please Enter Value of a :" );
     int a = sc.nextInt();
     
     System.out.println("Please Enter the value of b: ");
     int b = sc.nextInt();
     
     int max = ( a > b ) ? a : b;
     
     System.out.println("Maximum Value :" +max);
     
     }
     
}