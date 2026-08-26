import java.util.Scanner;

public class CountDigitsMethod3{

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

	System.out.println("Please Enter a Number:");
	int num = sc.nextInt();

	int count=0;

 if(num!=0)
	{
           do{
	       num = num / 10;
	       count++;

	   }  while(num!=0);

	}

	System.out.println(count);

}

}