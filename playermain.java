class player{

    String name;
    int runs;
    int matches;   // states

    void average()  // behaviour
    {
      double avg = runs / matches;

      System.out.println("Batting Average :" +avg);
     }

 }

class playermain{

  public static void main(String[] args){

   player p1 = new player();

   p1.name = "Vaibhav";
   p1.runs = 12000;
   p1.matches = 200;

   p1.average();

  }


}

