import java.util.Scanner;

public class ArrayAccendingOrder1{

 public static void main(String[] args){

 int[] arr = {10, 40, 30, 20, 50};

 for(int i = 0; i < arr.length-1; i++)
  {
  for(int j = i + 1; j < arr.length; j++)
  {
    if(arr[i] > arr[j])
    {
       int temp = arr[i]; //30
       arr[i] = arr[j];   //20
       arr[j] = temp;
  //30
     }

   }

  }

   for(int i = 0; i < arr.length; i++)
{
   System.out.println(+arr[i]); // 10 20

}

 }

 }

 