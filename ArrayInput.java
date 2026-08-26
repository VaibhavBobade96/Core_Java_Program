import java.util.Scanner;

public class ArrayInput{

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);

     System.out.print("Please enter a number of elements:");  // only msg print
     int n = sc.nextInt();             // to get the size : 5 of array  & n 

     int arr[] = new int[n];  // int[n] create 5 integers arry memory  & arr is object to store onl

     System.out.println("Enter :"+n+" Elements");  
     
     for(int i = 0; i < n; i++)
     {
        arr[i] = sc.nextInt(); // get user input and store arr[i]
     }

     System.out.println("Array Elements are :");

     for(int i = 0; i < n; i++)
     {
        System.out.println(arr[i]);
     }

  }

 }   