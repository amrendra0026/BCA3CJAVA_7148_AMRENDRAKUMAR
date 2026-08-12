// 7_6. Write a java progaram to Switch Case condition.

import java.util.Scanner;

public class prg07_7{
		
	public static void main(String[] args){
		
		    Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the day of number:");
			int week=input.nextInt();
			switch (week) 
			{
            case 1:
            System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday"); 
			break;
			case 4:
			System.out.println("Thursday");
            break;			
			case 5:
			System.out.println("Friday");
            break;			
			case 6:
			System.out.println("Saturday"); 
			break;
			case 7:
			System.out.println("Sunday"); 
            break;			
			default:
			System.out.println("Invalid day");
			}
   }			
}
