import java.util.Scanner;

public class BinarySearch{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int arr[] = {10, 20, 30, 40, 50, 60, 70};
           // 0   1   2   3   4   5   6
int start = 0;
int end = 6;
int flag = 0;
int mid = 0;


System.out.println("Enter a Searching Element :");
int search = sc.nextInt(); // 50

while(start <= end)      // 6 <= 6
{ 
   mid = (start + end) / 2;   // mid = 6/2 = 3  ----->   4 + 6 / 2 = 5

   if(arr[mid] == search)  //40 == 60
    {
       flag = 1;
       break;
    }

   if(arr[mid] < search)  //  60  < 50;
   {
      start = mid + 1;   // start = 5 + 1 = 6
   }
   else
   {
     end = mid - 1;  //50
   }

  }
  
  if(flag == 1)
  {
    System.out.println("Element Found at index :" +mid);
   }

  else{

     System.out.println("Element Not Fount");
    
    }

  }

}



