import java.util.Scanner;

public class ArrayCountPos_Neg&Zero{

   public static void main(String[] args){
      
   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter a Size of Element: ");
   int size = sc.nextInt();

   System.out.println("Please Enter the elements: ");

   int[] arr = new int[size];

   for(int index = 0; index < size; index++)
   {
      arr[index] = sc.nextInt();

   }

   }

 }

