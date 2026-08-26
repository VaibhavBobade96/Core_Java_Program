import java.util.Scanner;

public class PrintInvertedTriangle{

public static void main(String[] args){

for(int row = 0; row < 5 ; row++)
 {
   for(int col = row; col < 5; col++)
   {
     System.out.print(" * ");
   }

   System.out.println();
  }

 }

}

//* * * * *