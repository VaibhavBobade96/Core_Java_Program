
public class FunctionParameterCheckOddOrEven{

  static void Check(int num)
  {
     if(num % 2 == 0)
     {
         System.out.println("The Given Number is Even :" +num);
      }

      else
      {
        System.out.println("The Given Number is odd :" +num);
      }

  }


  public static void main(String[] args){

         Check(10);


  }

}