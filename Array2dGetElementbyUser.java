import java.util.Scanner;

public class Array2dGetElementbyUser{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Please Enter a array row size :");
 int row_size = sc.nextInt();

 System.out.println("Please Enter a array column size:" );
 int col_size = sc.nextInt();

 System.out.println("Start entering the element :");

 int arr[][] = new int[row_size][col_size];

 for(int row = 0; row < row_size; row++)
  {
    for(int col = 0; col < col_size; col++)
    {
      arr[row][col] = sc.nextInt();   
	}

   }
 System.out.println();
 System.out.println("Your Output...");
 System.out.println();

 for(int row = 0; row < row_size; row++)
  {
    for(int col = 0; col < col_size; col++)
    {
      System.out.print(arr[row][col] +" "+" "+" "+" ");
	}
	 System.out.println();
   }
 }

}

 