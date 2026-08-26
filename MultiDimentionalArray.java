import java.util.Scanner;

public class MultiDimentionalArray{

public static void main(String[] args){

Scanner sc = new Scanner (System.in);

int arr[][][] = {
                  {{90, 34}, {67, 82} },
		          {{75, 64}, {89, 45} },

                 };


for(int m = 0; m < arr.length; m++)
  {
    for(int r = 0; r < arr.length; r++)
    {
      for(int c = 0; c < arr.length; c++)
      {
        System.out.print(arr[m][r][c]+" ");
      }

      System.out.println();
    }
      
      System.out.println();

  }

}

}