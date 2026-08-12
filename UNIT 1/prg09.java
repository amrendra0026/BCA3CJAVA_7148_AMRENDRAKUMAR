// WRITE a java program to  find Student Result using if condition..

import java.util.Scanner;

	public class prg09{
		public static void main(String[] args){
			Scanner scn = new Scanner(System.in);
			
			System.out.println("enter your Gr no.");
			int Gr = scn.nextInt();
			
			scn.nextLine();
			
			System.out.println("enter your name");
			String Name = scn.nextLine();
			
			System.out.println("enter your marks of c");
			int c = scn.nextInt();
			
			System.out.println("enter your marks of Cplus");
			int cplus = scn.nextInt();
			
			System.out.println("enter your marks of java");
			int java = scn.nextInt();
			
			System.out.println("enter your marks of DS");
			int DS = scn.nextInt();
			
			System.out.println("enter your marks of html");
			int html = scn.nextInt();
			
			int total = c + cplus + java + DS + html;
			
			System.out.println("Gr no:" + Gr);
			
			System.out.println("Name:" + Name);
			
			System.out.println("your total marks is:" + total);
			
			float percentage = total/5;
			
			System.out.println("Your percentage is: " + percentage);

			if (percentage >= 90 && percentage <= 100) {
			System.out.println("Grade: A+");
			}
			else if (percentage >= 80) {
			System.out.println("Grade: A");
			}
			else if (percentage >= 70) {
			System.out.println("Grade: B");
			}
			else if (percentage >= 60) {
			System.out.println("Grade: C");
			}
			else if (percentage >= 35) {
			System.out.println("Result: Pass");
			}
			else {
			System.out.println("Result: Fail");
			}

			scn.close();
		}
	}
	
