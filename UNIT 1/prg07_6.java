// 7_6. Write a java progaram to use if, else, if, else condition.


import java.util.Scanner;

public class prg07_6{
	
	public static void main(String [] args){
		
		Scanner input = new  Scanner(System.in);
		
		System.out.print("Enter the attendance:");
	    int attendance = input.nextInt();
		System.out.println("Enter the examScore:");
		int examScore = input.nextInt();
		
		if (attendance >= 65) 
		{	
			if (examScore >= 65)
			{
			System.out.println("You Pass");
			}
			else 
			{
			System.out.println("You fail");
			}
		}
			else
				{
				if (examScore >= 65)
					{
					System.out.println("You fail");
					}
				else
					{
					System.out.println("You Fail");
					}
				}
	}
}
