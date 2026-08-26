class Student{

     int id;
     String name;

     Student(int x, String y)
     {
       id = x ;
       name = y;
     }

     void display()
     {
       System.out.println("id :" + id);
	   System.out.println("name :" + name);
	   System.out.println();


	 }
 
  }




class PrameterizedArguments{
 
    public static void main(String[] args){

    Student s1 = new Student(101, "Vaibhav");
    Student s2 = new Student(102, "Satish");

    s1.display();
    s2.display();

    }

}


      