import java.util.Scanner;

public class Array3DFindTheSmallestElement{

public static void main(String[] args){

int arr[][][] = {
                  {{45,45,56,89},{98,99,34},{34,87,76}},
		          {{89,43,21,90},{89,23,53},{12,53,53}},
		          {{98,98,90,80},{98,34,78},{89,90,84}},
                  {{89,43,21,90},{89,23,53},{12,53,53}},
		 };

int m =0;
int r =0;
int c = 0;

int Smallest = arr[m][r][c];

for( m = 0; m < arr.length; m++)
 { 
  for( r = 0; r < arr[m].length; r++)
   {
     for( c = 0; c < arr[m][r].length; c++)
     {
        if(arr[m][r][c] < Smallest)
         {
            largest = arr[m][r][c];
	      }
      }
    }
  }

  System.out.println("The Smallest :"+Smallest);
 }
}