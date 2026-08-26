class Student{

  int id;
  String name;
  int marks;

  void display()
  {
    
    System.out.println("Student id :" +id);
    System.out.println("Student name :" +name);
    System.out.println("Student marks :" +marks);

   
   }

 }

 class MainClass&Object1{

 public static void main(String[] args){
 
 Student s1 = new Student();

 s1.id = 101;
 s1.name = "vaibhav";
 s1.marks = 85;

 s1.display();

}

}

   