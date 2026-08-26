class Student{

  int id;
  String name;
  int marks;

  void display()
  {
    
    System.out.println("Student id :" +id);
    System.out.println("Student name :" +name);
    System.out.println("Student marks :" +marks);

	System.out.println("------------------------");

   
   }

 }

 class StudentDetails{

 public static void main(String[] args){
 
 Student s1 = new Student();

 s1.id = 101;
 s1.name = "vaibhav";
 s1.marks = 85;


 Student s2 = new Student();
 s2.id = 102;
 s2.name = "Satish";
 s2.marks = 65;

 Student s3 = new Student();
 s3.id = 103;
 s3.name = "Shrinivaas";
 s3.marks = 98;


 Student s4 = new Student();
 s4.id = 104;
 s4.name = "Sakharam";
 s4.marks = 87;

 Student s5 = new Student();
 s5.id = 105;
 s5.name = "Motiram";
 s5.marks = 88;


 s1.display();
 s2.display();
 s3.display();
 s4.display();
 s5.display();




}

}

   