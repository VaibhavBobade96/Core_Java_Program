import java.util.Scanner;

public class PrintfibonacciSeriesUserChoice{

 public static void main(String[] args){

	 Scanner sc = new Scanner(System.in);

    System.out.print("please enter the end number:");
    int endno = sc.nextInt();
    
    int firstno = 0;
    int secondno = 1;
    int next = 0 ;

    System.out.println(+firstno);  //0
   
    
    for(int i=1; i<=endno; i++)
    {
        firstno = secondno;
	    secondno = next;
		next = firstno + secondno;

	   System.out.println(+next);

     }

   }

 }
 
      
      
       

        