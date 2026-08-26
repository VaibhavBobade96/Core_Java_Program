import java.util.Scanner;

class CelciusToFarenheit
{
   public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Please Enter the tempareture in celcius =");
       int celcius = sc.nextInt();
       
       int farenheit = (celcius * 9/5) + 32;
       
       System.out.println("convert temperature celcius to farenheit =" +farenheit);
       }
       
    }
       
       