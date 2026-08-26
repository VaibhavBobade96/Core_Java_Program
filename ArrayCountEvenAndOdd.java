import java.util.Scanner;

public class ArrayCountEvenAndOdd{
   
   public static void main(String[] args){

   Scanner sc = new Scanner(System.in);
   System.out.print("please enter a size of the Array:");
   int size = sc.nextInt();

   System.out.println("Enter the array of element:");
   int even = 0;
   int odd = 0;
   int[] arr = new int[size];

   for(int index = 0; index < size; index++)
    {
       arr[index] = sc.nextInt();

    }
	
	for(int index = 0; index < size; index++)
    {
        if(arr[index]%2 == 0)
		{
            even++;
		}

		else{
               
			   odd++;

        }
	}

	 System.out.println("Total Even No :" +even);
	 System.out.println("Total odd No: " +odd);
  }

}


    