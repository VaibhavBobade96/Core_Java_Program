import java.util.Scanner;

public class ArrayFindTheShortestName{

  public static void main(String[] args){

  String[] arr = {"Vaibhav", "Shriniwas", "Satish", "Sakharam", "Prathmesh" };

  String shortest = arr[0];

  for(int i = 0; i < arr.length; i++)
  {
     if(arr[i].length() < shortest.length())
     {
        shortest = arr[i];
     }
  }

   System.out.println("Shortest String: " +shortest);

 }

}