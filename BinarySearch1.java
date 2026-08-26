import java.util.Scanner;

public class BinarySearch1{

public static void main(String[] args){

 int[] arr = { 10, 20, 30, 40, 50, 60, 70};

 int low = 0;
 int target = 50;        
 int high = arr.length-1;

 int mid = low + arr.length / 2;

// System.out.println("mid is :" +mid);
// System.out.println("The value is mid 3 :" +arr[mid]);

  for(int i = 0; i < arr.length; i++)
    {
     if(target == arr[mid])         // 40 == 50
		{
		  System.out.println(" Found ");
		  break;
		}

     else if(arr[mid] <= target)   // 30 
		{ 
		    mid++;

		     if (arr[mid] == target)
		     {
				 System.out.println("The Value is present on index :"+mid+ " The Target value is :" +arr[mid]);

				 break;
		     }  

			 else{
		   
		       System.out.println("The value is not present in these Array");
	       }
		   
           
		}
      

   
	}


   }

 }

