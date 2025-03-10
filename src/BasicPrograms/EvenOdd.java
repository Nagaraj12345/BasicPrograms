package BasicPrograms;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number to check EVEN or ODD");
		int number = scan.nextInt();
		if(number%2==0) {
			System.out.println("Number is EVEN");
		}
		else {
			System.out.println("Number is ODD");
		}
		
	}

}
