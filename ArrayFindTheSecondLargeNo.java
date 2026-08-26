import java.util.Scanner;

public class ArrayFindTheSecondLargeNo{

 public static void main(String[] args){

 int[] arr = {20, 40, 60, 100, 100};

 int SecondLarge = arr[0];
 int Greater = arr[0];

 for(int index = 0; index < arr.length; index++)
   { 
      if(arr[index] > Greater)   // 100 > 60
      { 
          SecondLarge = Greater;  // 60
          Greater = arr[index];  // 100
		                         
      }
      else{
           
	   if(Greater > SecondLarge && arr[index] != Greater)   //
	   {
              SecondLarge = arr[index];  // 
	   }

       }

	  

    }

    System.out.println("The Largest No :" +Greater);
    System.out.println("The Second Largest No:" +SecondLarge);

    }

  }