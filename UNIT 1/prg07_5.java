// 7_5. Write a java progaram to use if, else, if, else condition.


import java.util.Scanner;

public class prg07_5{
	
	public static void main(String [] args){
		
		Scanner input = new  Scanner(System.in);
		
		System.out.print("Enter the attendance:");
	    int attendance = input.nextInt();
		
		if (attendance <= 65) 
			{	
			System.out.println("You are not eligible for exam");
			}
			
		else 
			
			System.out.println("Enter the examScore:");
			int examScore = input.nextInt();
			{
				if (examScore >= 65)
				{
					System.out.println("You Pass");
				}
				else
				{
					System.out.println("You Fail");
				}
			}
	}
}
