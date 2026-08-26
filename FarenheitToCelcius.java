import java.util.Scanner;

class FarenheitToCelcius
{
  public static void main(String[] args)
    {  
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter the temparature in farenheit:");
       int farenheit = sc.nextInt();
       
       int celcius = (farenheit - 32 ) * 5 / 9;
       
       System.out.println("Convert the temparature in Farenheit to celcius :" +celcius);
       
       }
       
   }