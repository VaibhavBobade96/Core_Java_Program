import java.util.Scanner;

public class DayOfMonth{
   public static void main(String[] args)
   { 
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Please Enter a Month Number (1-12): ");
     int day = sc.nextInt();

     switch(day)
     {

       case 1 :
	System.out.println(" January ");
	break;

	case 2 :
	System.out.println(" Feabruary");
	break;

	case 3 :
	System.out.println(" March");
	break;

	case 4:
	System.out.println(" April ");
	break;

	case 5 :
	System.out.println(" may ");
	break;

	case 6 :
	System.out.println("June");
	break;

	case 7 :
	System.out.println("july");
	break;

	case 8:
	System.out.println("August");
	break;

	case 9:
	System.out.println("Saptember");
	break;

	case 10:
	System.out.println(" Actomber ");
	break;

	case 11:
	System.out.println(" November ");
	break;

	case 12: 
	System.out.println(" December ");
	break;

	default:
	{
		System.out.println(" Yout Entered Invalid Month " );

	}
}

}

}