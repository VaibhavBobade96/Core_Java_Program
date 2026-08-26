import java.util.Scanner;

public class Array2dExample2{

public static void main(String[] args){

int arr[][] = { { 19, 34, 54 },
                { 34, 43, 23 },
		        { 98, 42, 25 },
	         	{ 43, 98, 76 },
	         	{ 34, 45, 56 },
	     };

for(int row = 0 ; row < arr.length; row++)
{ 
  for(int col = 0 ; col < arr[row].length; col++)
  {
    System.out.print(arr[row][col] + " ");
  }

    System.out.println();

  }

 }

}