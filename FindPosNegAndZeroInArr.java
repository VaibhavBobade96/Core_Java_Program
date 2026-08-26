import java.util.Scanner;

public class FindPosNegAndZeroInArr{

public static void main(String[] args){

int arr[] = {34, 30, 22, 97, 53, 52, 0, -89, 83, -13, -49, 40};

int PositiveCount = 0;
int NegativeCount = 0;
int ZeroCount = 0;

System.out.println();
System.out.println("Inside Array Positive Negative & Zero Element : ");
System.out.println();

for(int i = 0; i < arr.length; i++)
{
   if(arr[i] > 0)
   {
       PositiveCount++;
   }

   else if(arr[i] < 0)
   {
       NegativeCount++;
   }
   
   else
    {
        ZeroCount++;
    } 

}
  System.out.println("Positive Elements :"+PositiveCount);
  System.out.println("Positive Elements :"+NegativeCount);
  System.out.println("Positive Elements :"+ZeroCount);
}

}

