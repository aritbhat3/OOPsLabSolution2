package OOPsLabSolution2;

public class employee {
	String firstName;
	String lastName;
	String department;
	final String company = ".tcs.com";
	String emailID;
	char[] password;

	public employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public static void main(String args[]) {
		credFetcherClass credFetch = new credFetcherClass();
		credentialService credServ = new credentialService();

		boolean nextIteration = false;
		do {
			employee e1 = new employee(credFetch.getFirstName(), credFetch.getLastName(), credFetch.getdepartment());

			e1.emailID = credServ.generateEmailAddress(e1);
			e1.password = credServ.generateRanPassword();

			System.out.print("Email    ---> " + e1.emailID + "\nPassword ---> ");
			for (int i = 0; i < e1.password.length; i++)
				System.out.print(e1.password[i]);

			nextIteration = credFetch.confNextIteration();

		} while (nextIteration);
	}

}