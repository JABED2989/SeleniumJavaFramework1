package mySecondProject;

import java.util.Scanner;

public class Practic1 {

	public static void main(String[] args) {
		
		
		
		//Get number of hours worked
		
		System.out.println("Enter the number of hours worked");
		
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		// Get hourly pay rate
		
		System.out.println("Enter the hourly pay rate:");
		double payrate = scanner.nextDouble();
		
		// Multiply hours and pay rate
		
		double pay = hours * payrate;
		 // Display resulta
		
		System.out.println("The employee gross pay is:" + pay);
		
		
		
		
	}

}
