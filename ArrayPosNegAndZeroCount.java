import java.util.Scanner;

public class ArrayPosNegAndZeroCount{

   public static void main(String[] args){
      
   Scanner sc = new Scanner(System.in);
   System.out.print("Please Enter a Size of Element: ");
   int size = sc.nextInt();

   System.out.println("Please Enter the elements: ");

   int[] arr = new int[size];

   int Positive = 0;
   int Negative = 0;
   int Zero = 0;

   for(int index = 0; index < size; index++)
   {
      arr[index] = sc.nextInt();

   }

   for(int index = 0; index < size; index++)
     {
        if(arr[index] > 0)
        { 
			Positive++;
        }
		else if(arr[index] < 0)
		 {
            Negative--;
		 }

		 else{
                Zero++;
		 }
	  }

	  System.out.println("Count Positive No :" +Positive);
	  System.out.println("Count Negative No :" +Negative);
	  System.out.println("Count Zero No :" +Zero);

   }

 }

