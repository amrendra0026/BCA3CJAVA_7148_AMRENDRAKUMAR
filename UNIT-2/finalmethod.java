class abhibasepolicy{

final void verifyIdentity(){
System.out.println("Student abhi Identity verified");
}
}

class student extends abhibasepolicy{
 void verifyIdentity(){
	 System.out.println("roll 123");

}
}


public class finalmethod{
public static void main(String args[]){
student m1=new student();
m1.verifyIdentity();
}

}