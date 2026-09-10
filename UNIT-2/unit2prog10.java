// write  a java program using abstract..

abstract  class Animal

{

public abstract void animalSound();

public void sleep()
{

System.out.println("Zzzzzzzzzz");
}

}

class dog extends Animal

{
    public void animalSound()
    {
    System.out.println("the dog says : woof woof" );
    }
}

public class unit2prog10

{
public static void main(String args[])

{
    dog mydog  = new dog();

    mydog.animalSound();
    mydog.sleep();
}
}