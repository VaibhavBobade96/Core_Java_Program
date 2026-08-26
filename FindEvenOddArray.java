import java.util.Scanner;

public class FindEvenOddArray{

public static void main(String[] args){

int arr[] = {34, 30, 22, 97, 53, 52, 0};

int even = 0;
int odd = 0;

System.out.println();
System.out.println("All Even No in Array ");
System.out.println();

for(int i = 0; i < arr.length; i++)
{
   if(arr[i] % 2 == 0)
   {
       System.out.println("evenNo:"+arr[i]);
   }

}

System.out.println();
System.out.println("All Odd No in Array ");
System.out.println();
   
for(int i = 0; i < arr.length; i++)
{
 if(arr[i] % 2 != 0)
   {
      System.out.println("evenNo:" +arr[i]);
   }
 }

}

}

