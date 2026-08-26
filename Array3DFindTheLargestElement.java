import java.util.Scanner;

public class Array3DFindTheLargestElement{

public static void main(String[] args){

int arr[][][] = {
                  {{45,45,56,89},{98,99,34},{34,87,76}},
		          {{89,43,21,90},{89,23,53},{12,53,53}},
		          {{98,98,90,80},{98,34,78},{89,90,84}},
                  {{89,43,21,90},{89,23,53},{12,53,53}},
		 };


int largest = 0;

for(int m = 0; m < arr.length; m++)
 { 
  for(int r = 0; r < arr[m].length; r++)
   {
     for(int c = 0; c < arr[m][r].length; c++)
     {
        if(arr[m][r][c] >= largest)
         {
            largest = arr[m][r][c];
	      }
      }
    }
  }

  System.out.println("The Largest :"+largest);
 }
}