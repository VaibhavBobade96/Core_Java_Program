class student{

   int id;
   String name;

   student()
   {
      id = 101;
      name = "Vaibhav";

   }

   void display()
   {
     System.out.println("id :" +id);
     System.out.println("name: " +name);
    }
 }


class Student0ArgumentConstructor{

  public static void main(String[] args){

  student s1 = new student();

  s1.display();

   }
 
}
