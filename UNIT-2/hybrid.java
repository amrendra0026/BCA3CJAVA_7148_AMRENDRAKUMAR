/* */
class Animal
{
	String name="Animal";
    public void eat()
	{
		System.out.println("The dog can eat:");
    }
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("The dog can bark:bhaou--bhaou");
	}
}

interface petanimal
{
	public  void cute();
	
}

class puppy extends Dog implements petanimal
{
	public void cute()
	{
		System.out.println("petanimal is cute: ");
	}
	public void weep()
	{
		System.out.println("puupy is weeping: ");
	}
}


public class hybrid
{
	public static void main(String args[])
	{
		puppy m1=new puppy();
		m1.eat();
		m1.bark();
		m1.cute();
		m1.weep();
	}
}