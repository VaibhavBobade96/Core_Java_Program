import java.util.Scanner;

public class ReverseTable{

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.println("please enter a numbe of table :");
       int num = sc.nextInt();

       for(int i=10; i>=1; i--)
       {
         int table = num * i;

	 System.out.println( num+ " * "  +i+ " = " +table);
       }

    }

    }
