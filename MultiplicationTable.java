import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

	System.out.print("Please Inter a Number of Table :");
	int num = sc.nextInt();

	for(int i=1; i<=10; i++)
	{
          int table = i * num;


	  System.out.println( num+ " * " +i+ " = "  +table);

	 }
}

}