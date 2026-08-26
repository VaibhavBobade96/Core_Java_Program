class CarDetails{
 
  String carBrand;
  String carColor;
  int speed;

  void accelerate()
  { 
     speed = speed + 20;
     System.out.println("Increase Spleed :" +speed +"km/hr");

   }

 }

 class CarDetailsMain{

  public static void main(String[] args){

   CarDetails cd1 = new CarDetails();

   cd1.carBrand = "BMW";
   cd1.carColor = "Black";
   cd1.speed = 50;

   cd1.accelerate();

  }

}
