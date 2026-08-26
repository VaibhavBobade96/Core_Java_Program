import java.util.Scanner;

public class ReverseArray{

   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.println("Please Enter a Size of array :");
   int size = sc.nextInt();
   System.out.println("Please Enter the "+size+" Elements :" );
   int index;
   int[] arr = new int[size];
   
   for(index = 0; index < size; index++)
   {
         arr[index] = sc.nextInt();
   }
   System.out.println(" Print The Reverse Array...");

    index = size - 1; // index = 4

     while(index >= 0)
     {
		 System.out.println("Reverse :"+arr[index]);
		 index--;
		 
     }
	
   }
   
  }







   