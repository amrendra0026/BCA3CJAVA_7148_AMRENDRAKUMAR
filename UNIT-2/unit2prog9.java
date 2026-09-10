// write a java program using super keyword

class vehicle
{
 
 int speed = 120;

 vehicle()
 
 {

 System.out.println("vehicle constructor called");

 }

 void run()
 {

System.out.println("vehicle is running");

 }

}

 class car extends vehicle
 {
   
   int speed = 180;

   car()
   {

   super();

   }

   void display()
   {

   System.out.println("car speed:" + speed);
   System.out.println("parent vehicle speed:" + super.speed);
   super.run();

   }

 }

 public class unit2prog9
 {
  public static void main(String args[])

  {
 
  car mycar = new car();
  mycar.run();
  
  }

 }