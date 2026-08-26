import java.util.Scanner;

public class ArrayFindTheSecondSmallestNo{

  public static void main(String[] args){

 int[] arr = {10, 20, 8, 32, 52, 78, 10, 1};

 int SecondSmall = arr[0];
 int Small = arr[0];

 for(int index = 0; index < arr.length; index++)
  {
    if(arr[index] < Small)
    { 
	   SecondSmall = Small;
       Small = arr[index];
    }

    else if(arr[index] < SecondSmall && Small != SecondSmall)
        {
           SecondSmall = arr[index];
	}

  }

        System.out.println("Print The Smallest No:" +Small);
	 System.out.println("Print The Secont Small No :" +SecondSmall);

}

}