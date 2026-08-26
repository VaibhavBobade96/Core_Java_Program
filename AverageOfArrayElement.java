import java.util.Scanner;

public class AverageOfArrayElement{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Please Enter a Array Size :");
int size = sc.nextInt();

int sum = 0;

System.out.println("Please Enter a Array Element :");

int arr[] = new int[size];

for(int i = 0; i < arr.length; i++)
{
  arr[i] = sc.nextInt();
  sum = sum + arr[i];
}

int avg = sum/size;

System.out.println("Average of array is :" +avg);

}

}

