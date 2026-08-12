 // Write a java program of 1D_3 array. (User input)


import java.util.Scanner;

public class prg10_3{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
			int marks [] = new int [5];
			
			for (int i = 0;i< marks.length;i++){
				
				System.out.print("enter the element of array:");
				marks [i] = scn.nextInt();
			}
			
				System.out.print("your array element are:");
				
				for(int i = 0;i<marks.length;i++){
					System.out.print(marks[i] + " ");
				}
	}
}