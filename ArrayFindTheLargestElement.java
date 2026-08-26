
public class ArrayFindTheLargestElement{

   public static void main(String[] args){

      int[] arr = {10, 20, 30 , 40, 100};
	            // 0    1   2    4   5

	  int LargeNo = 0;

     
	  for (int index=0; index < arr.length; index++)
	  {
		  if(arr[index] > LargeNo)                 
		  { 
              
               LargeNo = arr[index] ;
              

		  }
	  }

	   System.out.println("Print The Large No :" +LargeNo);
   }


}