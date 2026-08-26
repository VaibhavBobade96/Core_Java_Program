class temperature{

   int celcius;

   void ConvertFarenheit()
   {
     int farenheit = (celcius * 9 / 5) + 32;

     System.out.println("Celcius to Farenheit :" +farenheit);

     }

}

class TemperatureMain{

    public static void main(String[] args){

    temperature t1 = new temperature();
    t1.celcius = 30;
    
    t1.ConvertFarenheit();
    
    }

}
