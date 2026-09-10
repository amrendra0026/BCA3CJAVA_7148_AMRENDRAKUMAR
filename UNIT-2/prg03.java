// Write a java program to perform simple inheritance.//-

class Animal{
String name="Animal";
void eat(){
System.out.println("The dog can eat:");
}
}

class Dog extends Animal{
void bark(){
System.out.println("The dog can bark:bhaou--bhaou");
}
}

public class prg03{
public static void main(String args[]){
Dog myDog=new Dog();
myDog.eat();
myDog.bark();
}
}