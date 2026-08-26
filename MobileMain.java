class mobile{

   String brand;
   int price;

   void call(String number)
   {
      System.out.println("Calling..."+ number);
   }

   void display()
   {
     System.out.println("Brand Name :" +brand);
     System.out.println("price of phone :" +price);

   }

}

class MobileMain{
 
  public static void main(String[] args){

  mobile m1 = new mobile();
  m1.brand = "samsung";
  m1.price = 15000;
  m1.call("9838434923");
  m1.display();

 }


}