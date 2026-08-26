class Car{

   String name;
   String color;


 Car()
   {
     name = "BMW";
     color = "black";
   }

   void display()
   {
     System.out.println("car color :" +name);
     System.out.println("car brand :" +color);

    }

 }

class Car0ArgConstructor{

   public static void main(String[] args){

   Car c1 = new Car();

   c1.display();

    
   }

}