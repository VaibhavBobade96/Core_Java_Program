class product {

   String name;
   int price;
   int discount;

   void finalprice()
   {
     double amount = price - (price * discount / 100);

     System.out.println("Product Name :" +name);
     System.out.println("final price :" +amount);
    }

 }

 class ProductMain{

   public static void main(String[] args){

   product p1 = new product();

   p1.name = "Laptop";
   p1.price = 60000;
   p1.discount = 10;

   p1.finalprice();

   }

 }