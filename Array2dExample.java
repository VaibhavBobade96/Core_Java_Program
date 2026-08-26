import java.util.*;

public class Array2dExample{

public static void main(String[] args){

int arr[] [] = { 
                  { 5,  10, 15},
	              { 20, 25, 30},
	              { 35, 40, 45}
		};


   for(int row = 0; row < arr.length; row++)
    {
       for(int col = 0; col < arr.length; col++)
       {
          System.out.print(arr[row][col]+ " ");
	   }
	   System.out.println();
    }

  }

}