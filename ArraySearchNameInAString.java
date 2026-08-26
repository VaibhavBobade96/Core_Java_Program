import java.util.*;

public class ArraySearchNameInAString{

public static void main(String[] args){

 Scanner sc = new Scanner(System.in);

 System.out.print("Please Enter a array size: ");
 int size = sc.nextInt();

 System.out.println("Please "+size+" Names :");

 String Search = "Vaibhav";
 int i;

 String[] arr = new String[5];

   for(i = 0; i < arr.length; i++)
    {
      arr[i] = sc.next();
    }

	for(i = 0; i < arr.length; i++)
    {
       if( Search.equals(arr[i]))
		{
           System.out.println(i);
		}

	}

	

  }

}