import java.util.Scanner;

public class FindSmallestEmentInArray{

public static void main(String[] args){

int arr[] = {34, 24, 53, 21, 56, 22, 79};

int i = 0;

int smallest = arr[i];

for(i = 0; i < arr.length; i++)
    { 
       if(arr[i] < smallest)
       {
         smallest = arr[i];
       }

    }
     
	 System.out.println("smallest No :" +smallest);

  }

}

