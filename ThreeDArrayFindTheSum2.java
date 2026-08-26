import java.util.Scanner;

public class ThreeDArrayFindTheSum2{

public static void main(String[] args){

int arr[][][] = {
	             {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},  
				 {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},
			     {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},
				 {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},

             };
int sum = 0; 

for(int m = 0; m < arr.length; m++)
 {
   for(int r = 0; r < arr[m].length; r++)
   {
     for(int c = 0; c < arr[m][r].length; c++)
     {
       System.out.print(arr[m][r][c] +" ");
	   sum = sum + arr[m][r][c];

    }
       System.out.println();
    }
       System.out.println();
}

System.out.println("Sum of all elements :" +sum);

}

}
  


