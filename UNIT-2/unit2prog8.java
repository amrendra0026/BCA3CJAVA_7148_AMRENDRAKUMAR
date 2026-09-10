// write a java program of constructor overloading


class Box{
  
  double height, width , depth;

  Box() 
  
  {

  height = 1.0;

  width = 1.0;

  depth = 1.0;

  }

  Box(double len)

  {
    height = width = depth = len;
  }

  Box(double w, double h,double d)

  {

  height = h;
  width = w;
  depth = d;


  }

  void volume(){

    double result = width*height*depth;
    System.out.println(result);
  }

}

public class unit2prog8{

    public static void main (String args[]){

        Box b1 = new Box();
        Box b2 = new Box(5.0);
        Box b3 = new Box(2.0,3.0,4.0);

        b1.volume();
        b2.volume();
        b3.volume();
    }
}