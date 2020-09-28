package mySecondProject;

import java.util.Scanner;

public class Practic3 {

	public static void main(String[] args) {
		
		// Get the values
		int salary = 1000;
		int bonus = 250;
		
		System.out.println("Enter the sales for the week:");
		Scanner scanner = new Scanner(System.in);
		int hours = scanner.nextInt();
		
		//Switch case statement to calculate the salary
		
	switch(hours) {
	case 10 :
		System.out.println("The salary is : + salary");
		break;
	case 15 :
		salary = salary + bonus;
		System.out.println("The salary is : + salary");
		break;
	case 20 :
		salary = salary + bonus*2;
		System.out.println("The salary is : + salary");
		break;
	case 0 :
		salary = 500;
		System.out.println("The salary is : + salary");
		break;
		
		// To relase the momory space
			}
	scanner.close();
	}

}
