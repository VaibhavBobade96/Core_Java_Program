import java.util.Scanner;

public class Array2dLowestElement{

 public static void main(String[] args){

  int[][] arr = { 
                  {54, 43, 64, 64, 43},
		          {53, 54, 34, 24, 67},
		          {98, 56, 34, 25, 55},
		  
		 };


int lowest = arr[0][0];
 
 for(int row = 0; row < arr.length; row++)
 {
  for(int col = 0; col < arr.length; col++)
   {
     if(arr[row][col] < lowest)
     {
        lowest = arr[row][col];
     }

   }

 }
 System.out.println("Print the lowest Element :"+lowest);

 }

}


