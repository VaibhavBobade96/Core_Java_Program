import java.util.Scanner;

public class  AreaCalculator{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println(" 1.  Area Of Circle ");
System.out.println(" 2. Area of Rectangle ");
System.out.println(" 3. Area of Square ");
System.out.println(" 4. Area of Triangle");


System.out.println("Please enter Your choice:");
int choice = sc.nextInt();

switch(choice)
{
  case 1 : 
      System.out.println("Please Enter a Radius:");
      int radius = sc.nextInt();

      double AOC = 3.14 * radius * radius;
      System.out.println("Area of Circle :" +AOC);
      break;

  case 2 :
        System.out.println("Please Enter a length :");
	int length = sc.nextInt();

	System.out.println("Please Enter a Width :");
	int width = sc.nextInt();

	int AOR = length * width;

	System.out.println("Area of Reactangle : " +AOR);

        break;

  case 3 : 
       System.out.println("Please Enter a side :");
       int size = sc.nextInt();

       int AOS = size * size;

       System.out.println(" Area of Square :" +AOS);

       break;


  case 4 :
        System.out.println("Please Enter a base :");
	int base = sc.nextInt();

	System.out.println("Please Enter a height :");
	int height = sc.nextInt();

	double  AOT = 0.5 * base * height;

	System.out.println("Area of triangle is :" +AOT);
       
       break;


   default :
           
	   System.out.println("YOu Entered Invalid Number....");
  
    }

 }


}
	



    