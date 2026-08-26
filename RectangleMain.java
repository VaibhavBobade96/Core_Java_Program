class rectangle{

  int length;
  int width;

  int side;

  void AreaOfRectangle()
  {
    System.out.println("Area of rectangle :" +(length*width));

  }

   void AreaOfSquare()
	{
	   System.out.println("Area of Square :" +(side * side));
    }
}

class RectangleMain{

  public static void main(String[] args){

  rectangle r1 = new rectangle();

  r1.length = 12;
  r1.width = 12;
  
  r1.AreaOfRectangle();

  rectangle r2 = new rectangle();
  r2.side = 5;
  r2.AreaOfSquare();

   }

}
