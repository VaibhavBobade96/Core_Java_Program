import java.util.Scanner;

public class Array2dSumElements{

 public static void main(String[] args){

 int arr[] [] = { 
                   {23, 43, 53, 34 },
		           {34, 23, 23, 98 },
		           {23, 54, 43, 64 },
                 
		       };

 int sum = 0;

for(int row = 0; row < arr.length; row++)
 {
   for(int col = 0; col < arr[row].length; col++)
   {
     sum = sum + arr[row][col];

    }

  }

  System.out.println("Sum of 2 d array is :" + sum);

}

}
