// write a java program of encapsulation.

import java.util.Scanner;

public class unit2prog11{
    private String Name;

    public void getName() {
       System.out.println("My Name is : " + Name);
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        unit2prog11 myname = new unit2prog11();

        System.out.print("Please Enter Your Name : ");
        String name = input.nextLine();

        myname.setName(name);
        myname.getName();
    }

}