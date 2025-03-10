package BasicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	int count;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the to check prime or not!");
			int num = scan.nextInt();
//			boolean isPrime=false;
			int count = 1;
			if(num<=1) {
//				isPrime=false;
				System.out.println("Not Prime!");
			}
			else {
				for(int i=2; i<=num; i++) {
					
					count++;
					
				}
			}
			
			if(count==2) {
				System.out.println(num + " is prime number");
			}
			else {
				System.out.println(num + " is not prime");
			}
		}
		
	}

}
