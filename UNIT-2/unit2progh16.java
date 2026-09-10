// write a java program of interface?

interface  Animal{
    void makeSound();
    void eat();
}
class Dog implements Animal{
    public void  makeSound(){
        System.out.println("Woof !");
    }
    public  void eat(){
        System.out.println("Dog is Eating Dog Food ");
    }
}

class Cat implements  Animal{
    public void makeSound(){
        System.out.println("Meow....");
    }
    public void eat(){
        System.out.println("Cat is eating Cat Food !");
    }
}

public class unit2progh16{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat mycat = new Cat();

        myDog.makeSound();
        myDog.eat();
        mycat.makeSound();
        mycat.eat();
    }
}