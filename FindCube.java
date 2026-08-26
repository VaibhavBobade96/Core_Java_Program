import java.util.Scanner;
class FindCube
{
  public static void main(String[] args)
  {   
     System.out.print("Please Enter a Number:");
     
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     
     int cube = num*num*num;
     
     System.out.println("Number is :" +num);
     System.out.println("Number of Cube is :" +cube);
     
     }
     
   }