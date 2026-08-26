import java.util.Scanner;

class Discount 
{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println(" Enter the Price of Product :");
    double amount = sc.nextDouble();
	
	double discount = 0;
    
    if( amount >= 5000)
    {
        discount = amount * 0.30;
	

    }
    
    else if( amount >= 3000)
    {
	discount = amount * 0.20;
    
    
    }
    
    else if( amount >= 1000)
    {
         discount = amount * 0.10;
    
    
    }
    
    else {
    
        discount = 0;
	
    }
    
    
	double FinalAmount = amount - discount;
	
    System.out.println("Discount :" + discount);
    System.out.println("Final Amount :" + FinalAmount);
    
    }
	
}