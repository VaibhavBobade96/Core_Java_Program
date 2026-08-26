import java.util.Scanner;

public class FindArmstrongNumber{
 
  public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

	System.out.println("Please Enter a Number :");  // 153
	int num = sc.nextInt();
	int original = num;
	int rem ;
	int arm=0;
	
	while(num != 0)// 153 == 0
	   {
        rem = num % 10;  //3
	    arm = rem * rem * rem + arm ; // 27
	    num = num / 10;

     
	    }
		System.out.println("Arm Value :" +arm);
		System.out.println("Num Value :" +num);
		System.out.println("The Original Value :"+original);

		if(arm  == original)
		 {
           System.out.println("The Given Number is Armstrong :" +arm);
	    }

    	else{

           System.out.println("The Given Number is Not Armstrong :" +arm);
	     } 
    
    }
}
















