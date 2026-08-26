
public class ArrayExample2{

   public static void main(String[] args){

      int[] arr = new int[5]; // array create & and array size declare in these line

      arr[0]=10;
      arr[1]=20;
      arr[2]=30;
      arr[3]=40;
      arr[4]=50;

	  System.out.println("print the arry elements:");

      int i;

      for(i=0; i < arr.length; i++)
      {
         System.out.println(arr[i]);
      }
   
   }

 }