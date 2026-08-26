class employee{

  int id;
  String name;
  double salary;

   
  employee()
  {
    id = 101;
    name = "Vaibhav";
    salary = 40000;

  }

  void display()
  {
    System.out.println("id :" +id);
    System.out.println("name :" +name);
    System.out.println("Salary :"+salary);

  }

}

class Employee0ArgConstructor{
 
   public static void main(String[] args){

    employee e1 = new employee();
    e1.display();

    }

}

