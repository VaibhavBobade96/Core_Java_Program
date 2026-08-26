import java.util.Scanner;

public class ArrayFindTheLongestString{

 public static void main(String[] args){

 String[] arr = {"Vaibhav", "Satish", "Sakharam", "Ram", "Shriniwas"};

 String longest = arr[0];

 for(int i = 0; i < arr.length; i++)
 {
   if(arr[i].length() > longest.length())
    {
        longest = arr[i];
    }

  }

  System.out.println(longest);

 }


}