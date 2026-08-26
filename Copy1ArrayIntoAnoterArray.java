
public class Copy1ArrayIntoAnoterArray{

  public static void main(String[] args){    

   int [] arr1 = {10, 20, 30, 40, 50};

   int [] arr2 = new int[arr1.length];
  
   for(int index = 0; index < arr1.length; index++)
    {
        arr2[index] = arr1[index];

    }

	 
     
     System.out.println("Successfully Copy....");

	 System.out.println("Access element of arr2 :" +arr2[3]);

    }

   }
   
 