// WRITE A JAVA PROGRAM TO FIND ODD OR EVEN NUMER USING USER INPUT.


import java.util.Scanner;

	public class prg08_2{
		public static void main(String []args){
			Scanner scn =new Scanner(System.in);
			
			System.out.println("enter your number:");
			int a = scn.nextInt();
		
			if(a%2==0){
			System.out.println("This number is even");
			}
			else{
			System.out.println("This number is odd");
			}
		}
		
		
	}
