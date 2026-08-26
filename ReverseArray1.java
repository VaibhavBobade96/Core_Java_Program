import java.util.Scanner;

public class ReverseArray1{

   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the array size :");
    int size = sc.nextInt();
    
    int[] arr = new int[size];

    System.out.println("Please enter the array Element :");

    for(int index = 0; index < size; index++)
    {
        arr[index] = sc.nextInt();

    }

    for(int index = size - 1; index >= 0; index--)
    {
       System.out.println("Reverse Element :"+arr[index]);
    }

  }

}