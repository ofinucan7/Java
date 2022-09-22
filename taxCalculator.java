import java.util.Scanner;

public class taxCalculator {
	public static void main(String args[]){
		
		//variables
		double income;
		double tax; // the amount that the user is taxed
		double compare = 0;
		Scanner keyboard = new Scanner(System.in); //keyboard
		
		//constants
		final double one = 0.10;
		final double two = 0.12;
		final double three = 0.22;
		final double four = 0.24;
		final double five = 0.32;
		final double six = 0.35;
		final double seven = 0.37;
		
		System.out.println("Enter how much you pay");
		income = keyboard.nextDouble();
		//Determining what your tax bracket user is under
		if (income => 523601) {
			compare = 7; //sets tax bracket to 7
			
		} else if (income => 209425) {
			compare = 6; //sets tax bracket to 6
			
		} else if (income => 164925) {
			compare = 5; //sets tax bracket to 5
			
		} else if (income => 86375) {
			compare = 4; //sets tax bracket to 4
			
		} else if (income => 40525) {
			compare = 3; //sets tax bracket to 3
			
		} else if (income => 9950) {
			compare = 2; //sets tax bracket to 2
			
		} else {
			compare = 1; //sets tax bracket to 1
		} 
		
		if (compare == 1) {
			tax = one * income; //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else if (compare == 2) {
			tax = 995 + ((income-9950) * two); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else if (compare == 3) {
			tax = 4664 + ((income-40525) * three); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else if (compare == 4) {
			tax = 14741 + ((income-86375) * four); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else if (compare == 5) {
			tax = 33603 + ((income-164925) * five); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else if (compare == 6) {
			tax = 47843 + ((income - 209425) * six); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} else {
			tax = 157804.25 + ((income-523600) * seven); //calculates the amount of tax owed for the respecive tax bracket
			System.out.println("You are going to owe: " + tax + " in taxes this year.");
			
		} 
	}
	}