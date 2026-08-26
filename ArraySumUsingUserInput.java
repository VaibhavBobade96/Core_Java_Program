import java.util.Scanner;

public class ArraySumUsingUserInput{

     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.print("Please enter the size of elements:");
     int size = sc.nextInt();

     int[] arr = new int[size];
	 int count = 0;
	 int sum = 0;

     System.out.println("please enter the "+size+" Elements");
      
	  int index;

	 for(index = 0; index < size; index++)
		 {
               arr[index] = sc.nextInt();
			   sum = sum + arr[index];
		 }
    
	  for(index = 0; index < size; index++)
		 {
		   count++;
           System.out.println("Print "+count+" element :" +arr[index]);
		 }

	   System.out.println("Print the Sum of all Elements :" +sum);N
     }

  }


//index 0 < 5 


       