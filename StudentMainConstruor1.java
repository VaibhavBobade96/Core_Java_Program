class student{

  int id ;
  String name;
   
     // 0 argument constructor
   student()
   {
     id = 101;
     name = "vaibhav";

	 System.out.println(" id : "+id);
	 System.out.println(" name : " +name);

   }

}

class StudentMainConstruor1{

  public static void main(String[] args){
  
         new student();
	 
  }


}