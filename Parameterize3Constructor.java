class employee{

   int id;
   String name;
   double salary;

   employee(int x, String y, double z)
   {
     id = x;
     name = y;
     salary = z;

    }

   void display()
   {
     System.out.println("id :" +id);
     System.out.println("name :" +name);
     System.out.println("Salary.."+salary);

	 System.out.println();
   }

}


class Parameterize3Constructor{

   public static void main(String[] args){
    
   employee e1 = new employee(101, "vaibhav", 80000);
   employee e2 = new employee(102, "satish", 89337);

   e1.display();
   e2.display();

   }

}


     