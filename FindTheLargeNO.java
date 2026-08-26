import java.util.Scanner;

public class FindTheLargeNO{

public static void main(String[] args){

int arr[] = {5, 50, 15, 40, 25, 60};

int largest = 0;

for(int i = 0; i < arr.length; i++)
{
   if(arr[i] > largest)
   {
      largest = arr[i];

    }

  }

  System.out.println("The largest Element in These Array :" +largest);

 }
}
