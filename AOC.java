import java.util.Scanner;

class AOC
{
  public static void main(String[] args)
  {
     float pi = 3.14f;
  // double pi = 3.14;
     
     System.out.print("Please Enter a Value of Radius:");
     Scanner sc = new Scanner(System.in);
     int radius = sc.nextInt();
     
     float AOC = pi*radius*radius;
     
     System.out.println("Area of Circle is :" +AOC);
     
     }
     
  }
