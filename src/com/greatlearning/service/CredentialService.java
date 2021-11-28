package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(Employee emp) {
		String email = emp.getFirstName().toLowerCase()+"."+emp.getLastName().toLowerCase()+"@"+emp.getDepartment()+".abc.com";
		return email;
	}
	
	public String generatePassword() {
		
		Random random = new Random();
		//Explore Class String BUilder
		String capitalLetters = "ACDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^*()_+~<>?/";
		
		String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;
		
		char[] password = new char[8];
		for( int i=0; i<8; i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
		}
		return new String(password);
		
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		
		System.out.println(" Dear "+ emp.getFirstName()+ "  Here are your credentials");
		System.out.println("Email ---"+ email);
		System.out.println("Password ---"+ password);
		
	}
}
