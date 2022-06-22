package com.emailapp.service;
	//this is for password generation

import java.util.Random;

import com.emailapp.model.EmpDetails;

public class CredentialService {

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String spCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters+smallLetters+numbers+spCharacters;
	

		Random rd = new Random();
			// generating password of 8 characters
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) { //
			
			password[i] = values.charAt(rd.nextInt(values.length()));
		}
		return password;
	}
	
	public String generateemailid(String firstName, String lastName, String department)
		{
		String EmailId = firstName+lastName+"@"+department+".abc.com";
		return EmailId;
		}
	
	public void showCredentials(EmpDetails EmpDetails, String EmailId, char[] password) {
		
		System.out.println("Dear "+EmpDetails.getFirstName()+ " "+EmpDetails.getLastName()+" your generated credentials are as follows ");
		
		System.out.println("Email Id --- "+ EmailId);
		
		System.out.print("Password --- ");
		
		System.out.print(generatePassword());
	}
	
}
	
