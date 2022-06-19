package OOPsLabSolution2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class credFetcherClass {
	Scanner inputReader = new Scanner(System.in);

	public String getFirstName() {
		System.out.println("Welcome to the System, please enter your first name :");
		String firstName = inputReader.next();
		return firstName;
	}

	public String getLastName() {
		System.out.println("Thank you for entering your first name, now please enter your last name:");
		String lastName = inputReader.next();
		return lastName;
	}

	public String getdepartment() {
		boolean incorrectInput = true;
		int userChoice = -1;
		try {
			do {
				System.out.println("Please enter the department from the following\n" + "1. Technical\n" + "2. Admin\n"
						+ "3. Human Resources\n" + "4. Legal");
				userChoice = inputReader.nextInt();
				if (userChoice > 0 && userChoice < 5) {
					incorrectInput = false;
					switch (userChoice) {
					case 1:
						return "tech";
					case 2:
						return "admin";
					case 3:
						return "hr";
					case 4:
						return "legal";
					}
				} else
					System.out.println("Incorrect Input chosen, please try again.");
			} while (incorrectInput);
		} catch (InputMismatchException e) {
			System.out.println("Please input a numeric value only. Please run again.");
			System.exit(0);
		}
		return "Department Not found";
	}

	public boolean confNextIteration() {
		int userChoice = 0;
		do {
			try {
				System.out.println("Do you wish to iterate again?\n1) Yes\n2)No");
				userChoice = inputReader.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please input a numeric value only.");
				System.exit(0);
			}
			if (userChoice == 1)
				return true;
			else if (userChoice == 2)
				return false;
			else {
				System.out.println("Please enter a valid choice only. Please run again.");
				userChoice = 0;
			}
		} while (userChoice == 0);
		return false;
	}
}
