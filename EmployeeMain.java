class employee{

    int id;
    String name;
    double salary;

    void DisplaySalary()
    {
       System.out.println("Employee id :" +id);
       System.out.println("Employee name :" +name);
       System.out.println("Employee Salary :"+salary);
       System.out.println("---------------------------");
    }
 
 }

 class EmployeeMain{

 public static void main(String[] args){

   employee e1 = new employee();

   e1.id = 101;
   e1.name = "vaibhav";
   e1.salary = 50000;

   e1.DisplaySalary();

   employee e2 = new employee();
   e2.id = 102;
   e2.name = "satish";
   e2.salary = 78000;

   e2.DisplaySalary();

   employee e3 = new employee();
   e3.id = 103;
   e3.name = "Shrinivaas";
   e3.salary = 67888;
   
   e3.DisplaySalary();

   employee e4 = new employee();
   e4.id = 103;
   e4.name = "Shrinivaas";
   e4.salary = 67888;
   
   e4.DisplaySalary();


  }

 }