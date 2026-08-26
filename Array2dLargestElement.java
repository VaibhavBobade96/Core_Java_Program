import java.util.Scanner;

public class Array2dLargestElement{

  public static void main(String[] args){

   int arr[][] = {  
                    {34, 43, 43, 43 },
		            {35, 98, 35, 78 }, 
		            {98, 45, 53, 23 },
		            {43, 54, 43, 54 },

		 };

int largest = 0;


for(int row = 0; row < arr.length; row++)
  {
    for(int col = 0; col < arr[row].length; col++)
    {
      if(arr[row][col] > largest)
      {
         largest = arr[row][col];
       }
     }

  }
 
   System.out.println("The Largest Element in 2d array is :" +largest);

 }


}   
