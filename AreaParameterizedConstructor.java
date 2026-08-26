class area{

   int length;
   int width;

   area(int l, int w)
   {
     length = l;
     width = w;

   }

    void display()
    {
      
      System.out.println("length :"+length);
      System.out.println("width :"+width);
      System.out.println("Area of rectangle :"+(length * width));
     }

 }

 class AreaParameterizedConstructor{

      public static void main(String[] args){

      area a1 = new area(6, 6);

	  a1.display();

      }

 }

