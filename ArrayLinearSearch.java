import java.util.Scanner;

public class ArrayLinearSearch{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.print("Please enter the array size:");
     int size = sc.nextInt();
     System.out.println("Please Enter the Array Elements:");

     int[] arr = new int[size];

     int search = 45;

     for(int index = 0; index < size; index++)
     {
         arr[index]  = sc.nextInt();
     }

     for(int index = 0; index < size; index++)
     {
         if(arr[index] == search)
	 {
            System.out.println("Element is fount at the " +index+ " Position or value is :" +arr[index]);
	 }
     }

   }

}