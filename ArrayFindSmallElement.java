import java.util.Scanner;

public class ArrayFindSmallElement{

   public static void main(String[] args){

       int[] arr = {23, 323,  98, 34, 89};
       int index = 0;
       int SmallestNo = arr[index];

       for(index = 0; index < arr.length; index++)
       {
           if(arr[index] < SmallestNo)
	   {
	      SmallestNo = arr[index];

	   }

       }  
	   
	   System.out.println("Smallest No = " +SmallestNo);

   }

   }