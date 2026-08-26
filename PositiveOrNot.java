import java.util.Scanner;

public class PositiveOrNot{

  public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     
     System.out.println("Please Enter Any a Number :");
     int num = sc.nextInt();

     if(num>0)
     {
        System.out.println("The Given Number is Positive :"+num);
     }
  
}


}