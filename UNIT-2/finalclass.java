final class Animal{

void eat(){
System.out.println("dog can eat");
}
}

class dog extends Animal{


}


public class finalclass{
public static void main(String args[]){
dog m1=new dog();
m1.eat();
}

}