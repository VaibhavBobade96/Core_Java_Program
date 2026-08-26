import java.util.Scanner;

public class ThreeDArrayFindTheSum{

public static void main(String[] args){

int arr[][][] = {
	             {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},  
				 {{34,34,23},{34,54,35},{34,34,64},{34,43,54}},
			     { {34,34,23},{34,54,35},{34,34,64},{34,43,54}},
				 { {34,34,23},{34,54,35},{34,34,64},{34,43,54}},

             };


for(int m = 0; m < arr.length; m++)
 {
   for(int r = m+1; r < arr.length; r++)
   {
     for(int col = r+1; col < arr.length; col++)
     {
       System.out.print(arr[m][r][col]);

    }
       System.out.println();
    }
       System.out.println();
}

}

}
  


