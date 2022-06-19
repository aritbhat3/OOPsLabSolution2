package OOPsLabSolution2;

import java.util.Random;

public class credentialService {
	public String generateEmailAddress(employee e1) {
		String emailID = e1.firstName.toLowerCase() + e1.lastName.toLowerCase() + "@" + e1.department + e1.company;
		return emailID;
	}

	public char[] generateRanPassword() {
		String capLet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smalLet = capLet.toLowerCase();
		String numbers = "0123456789";
		String symbols = "!@#$%^&*";
		String masterPool = capLet + smalLet + numbers + symbols;
		Random ranGen = new Random();

		char[] pwdArr = new char[8];

		for (int i = 0; i < 8; i++) {
			pwdArr[i] = masterPool.charAt(ranGen.nextInt(masterPool.length()));
		}
		return pwdArr;
	}
}