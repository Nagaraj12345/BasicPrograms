package BasicPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter the number to check the number is Factorial or not!!!");
			int number = scan.nextInt();
			int fact=1;
			for(int i=1; i<=number; i++) {
				
				fact = fact*i ;
				
			}
			System.out.println("Factorial of " + number + " is: " + fact);
			
		}
		
	}

}
