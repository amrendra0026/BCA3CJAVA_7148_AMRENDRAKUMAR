// write a java program of inheritence

interface Animal{
    void  makeSound();
    void eat();
    void Run();
}
interface childAnima extends Animal{
    void drink();
}

class puppy implements childAnima{

    public void drink(){
        System.out.println("Puppy is drinking milk..");
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void Run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof.. WOof..!");
    }

    @Override
    public void eat() {
       System.out.println("Dog is Eating Dog Food ");
    }

    @Override
    public void Run() {
        System.out.println("Dog is run Fast...");
    }
}


public class unit2prog12{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        puppy mypuppy = new puppy();

        myDog.makeSound();
        myDog.eat();
        myDog.Run();
        mypuppy.drink();
    }
}