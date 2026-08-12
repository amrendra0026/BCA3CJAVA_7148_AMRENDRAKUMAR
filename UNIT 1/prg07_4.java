// 7_4. Write a java progaram to use if, if, else, else condition.


import java.util.Scanner;

public class prg07_4{
	
	public static void main(String [] args){
		
		Scanner input = new  Scanner(System.in);
		
		System.out.print("Enter the attendance:");
	    int attendance = input.nextInt();
		
		if (attendance>=65) 
			{	
			System.out.println("Enter your examScore");
			int examScore = input.nextInt();
			if  (examScore>=70)
			{
			System.out.println("result : Pass");
			}
			else 
			{
			System.out.println("result : Fail");
			}
			}
			else 
			{
			System.out.println("reslut : attendance low ");
			}
			System.out.println("Execution complete.");
		}
	}
