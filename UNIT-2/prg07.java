//ABSTRACT//
abstract class Animal{
	public abstract void animalSound(){}
    
	public void sleep(){
		System.out.println("Zzzzzz");
		
	}

}


class cat extends Animal{
public void animalSound(){
System.out.println("The dog can says:bhaou--bhaou");
}
}

public class prg07{
public static void main(String args[]){
cat mycat=new cat();
mycat.animalSound();
mycat.sleep();

}
}
