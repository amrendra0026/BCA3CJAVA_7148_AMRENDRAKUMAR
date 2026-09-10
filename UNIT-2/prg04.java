//Write a java program to use multilevel inheritance.//-


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


class puppy extends Dog{
void Weep(){
System.out.println("The puppy is weeping");
}
}

public class prg04{
public static void main(String args[]){
puppy p = new puppy();
p.eat();
p.bark();
p.Weep();
}
}