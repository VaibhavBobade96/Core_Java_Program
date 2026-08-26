import java.util.Scanner;

public class CheckRange{
 
  public static void main(String[] args){
   
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter a no:");
     int num = sc.nextInt();

     if(num>=50 && num<=100)
     {
       System.out.println("These number is between 50 and 100 : " +num);
      
      }

    }
   
 }