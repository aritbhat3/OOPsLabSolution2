package OOPsLabSolution2;

import java.util.Random;

public class credentialService {
	public String generateEmailAddress(employee e1) {
		String emailID = e1.firstName.toLowerCase() + e1.lastName.toLowerCase() + "@" + e1.department + e1.company;
		return emailID;
	}

	public String generatePassword() {
		String capLet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smalLet = capLet.toLowerCase();
		String numbers = "0123456789";
		String symbols = "!@#$%^&*";
		Random ranGen = new Random();

		char[] pwdArr = new char[8];
		String pwd = "";

		pwdArr[0] = numbers.charAt(ranGen.nextInt(0, 10));
		pwdArr[1] = numbers.charAt(ranGen.nextInt(0, 10));
		pwdArr[2] = numbers.charAt(ranGen.nextInt(0, 10));
		pwdArr[3] = capLet.charAt(ranGen.nextInt(0, 26));
		pwdArr[4] = symbols.charAt(ranGen.nextInt(0, 8));
		pwdArr[5] = smalLet.charAt(ranGen.nextInt(0, 26));
		pwdArr[6] = capLet.charAt(ranGen.nextInt(0, 26));
		pwdArr[7] = capLet.charAt(ranGen.nextInt(0, 26));

		for (int i = 0; i < 8; i++) {
			pwd = pwd + (String.valueOf(pwdArr[i]));
		}
		return pwd;
	}
}