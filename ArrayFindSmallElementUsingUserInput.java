import java.util.Scanner;

public class ArrayFindSmallElementUsingUserInput{

   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter a Array Size: " );
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Please Enter the " +size+ " Element :" );                                                                  

    for(int index = 0; index < size; index++)
    {
        arr[index]  = sc.nextInt();

     }

	int index = 0;
	int SmallestNo = arr[index];

     for(index = 0; index < size; index++)
     {
         if(arr[index] < SmallestNo)
	   {

	     SmallestNo = arr[index];

	    }

		
    }

       System.out.println("Smallest Index :" +SmallestNo);


    }


   }
