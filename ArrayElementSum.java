import java.util.Scanner;

public class ArrayElementSum{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int sum = 0;

System.out.println("Please Enter a  5 array elements :");

int arr[] = new int[5];

for(int i = 0; i < arr.length; i++)
{
    arr[i] = sc.nextInt();
   sum = sum + arr[i];
}


System.out.println("Array sum :" +sum);


}

}


