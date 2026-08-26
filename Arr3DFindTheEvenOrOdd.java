import java.util.Scanner;

public class Arr3DFindTheEvenOrOdd{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Please Enter a size of array :" );
int size = sc.nextInt();

System.out.println("Please Enter a Element :");

int arr[][][] = new int[size][size][size];

for(int m = 0; m < arr.length; m++)
 {
  for(int r = 0; r < arr[m].length; r++)
  {
   for(int c = 0; c < arr[m][r].length; c++)
   {
	  arr[m][r][c] = sc.nextInt();
   }

  }

 }

for(int m = 0; m < arr.length; m++)
 {
  for(int r = 0; r < arr[m].length; r++)
  {
   for(int c = 0; c < arr[m][r].length; c++)
   {
     if(arr[m][r][c] % 2 == 0)
     {
       System.out.println("Even No :"+arr[m][r][c]);
     }
     else{
         System.out.println("Odd No :"+arr[m][r][c]);
	 }

     }

   }

  }

 }

}