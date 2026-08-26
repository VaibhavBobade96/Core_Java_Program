import java.util.Scanner;

public class ArrayFindTheAverage{
 
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Please Enter the Size of Array:");
     int size = sc.nextInt();
     int count=0;
	 int index;
	 int sum = 0;
	 int average;

     int[] arr = new int[size];

     System .out.println("please Enter the Array Elements:");

     for(index = 0; index < size; index++)
     {
         arr[index] = sc.nextInt(); // arr[0] = 10

		 sum = sum + arr[index];
     }

     for(index = 0; index < size; index++)
     {
        count ++;
        System.out.println(" Print "+count+ " array Elemtn " +arr[index]);
     }

	 System.out.println();
	 System.out.println("Sum of all Array Elements:" +sum);


     average = sum / count;

	 System.out.println();
	 System.out.println("The average of all elements :" +average);


  }

}
