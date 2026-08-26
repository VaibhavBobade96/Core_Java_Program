import java.util.Scanner;

class CheckPassOrFail
{
  public static void main(String[] args)
   { 
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Please Enter a Marks of ");
      
      System.out.println();
      System.out.print("please enter a Science Subject Marks:");
      int science = sc.nextInt();
      
      System.out.print("Please Enter a Math Marks :");
      int math = sc.nextInt();
      
      System.out.print("Please Eneter a Biology Marks :");
      int Biology = sc.nextInt();
      
      System.out.print("Please Enter a Checmistry Marks:");
      int Chemistry = sc.nextInt();
      
      System.out.print("Please Enter a Physics Marks:");
      int Physics = sc.nextInt();
      
      if(science >= 35 && math >= 35 && Biology >= 35 && Chemistry >= 35 && Physics >= 35)
      {
         System.out.println(" You are a Pass : ");
	 
      }
      
      else 
      {
      
        System.out.print(" Sorry you are not eligible for goto next class please you are a give reexam  ");
       } 
       
    }
    
  }