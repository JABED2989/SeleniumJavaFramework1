package mySecondProject;

import java.util.Scanner;

public class Practic2 {

	public static void main(String[] args) {
		
		//Get the payment of the week
		
		int salary = 1000;
		int quota = 10;
		int bonus = 250;
		
		//Get the unknown values
		
		System.out.println("How many sales did the emplyee make this week ? :");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		
		//Put the condition and calculate
		
		if(sales>10) {//if is a condition - if it is true, then it will execute inside the if block
		if(sales>20) 
		{
		salary = salary + bonus *2;
		System.out.println("The salary with bonus is : $" + salary);
		}
		else {
			salary = salary + bonus;
			// print the result
			System.out.println("The salary with bonus is : $" + salary);
			//"Sysout" + (cntrl + spacebar)
						
		}
			
		}
		
		else if(sales<10 && sales>5){
		salary = salary - bonus;
		// print the result
		System.out.println("The salary is if less than or equal to sales : $" + salary);
		//"Sysout + (cntrl+spacebar)
		}
		else if (sales==0) {
			salary = bonus;
			//print the result
			System.out.println("The salary if there are 0 Sales : $ + salary);");//"Sysout" + (cntrl + spacebar)
			}		
		else
			//Print the result
			System.out.println("The salary is if less than or equal to 10 sales: $" + salary); //"Sysout" + (Cntrl + spacebar)
	}
	}