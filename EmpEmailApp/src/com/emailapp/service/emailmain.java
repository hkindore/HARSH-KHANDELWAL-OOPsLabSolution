package com.emailapp.service;

import java.util.Scanner;

import com.emailapp.model.EmpDetails;

public class emailmain {

	public static void main(String[] args) {

		EmpDetails employee = new EmpDetails("Harsh", "Khandelwal");
		
		CredentialService cs = new CredentialService();
		
		String generatedEmail;
		
		char[] generatedPassword;

		System.out.println("Please enter the department from the following ");
		
			System.out.println("1. Technical");
		
			System.out.println("2. Admin");
		
			System.out.println("3. Human Resource");
		
			System.out.println("4. Legal");

		
		Scanner sc = new Scanner(System.in);
		
		int option = sc.nextInt();

		if (option == 1) {
		
			generatedEmail = cs.generateemailid(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "tech");
			
			generatedPassword = cs.generatePassword();
			
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else if (option == 2) {
			
			generatedEmail = cs.generateemailid(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "adm");

			generatedPassword = cs.generatePassword();
	
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		
		}
		
		else if (option == 3) {
		
			generatedEmail = cs.generateemailid(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "hr");

			generatedPassword = cs.generatePassword();
		
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}

		else if (option == 4) {
		
			generatedEmail = cs.generateemailid(employee.getFirstName().toLowerCase(),
			
			employee.getLastName().toLowerCase(), "lg");
			
			generatedPassword = cs.generatePassword();
			
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		else
		{
			
			System.out.println("Enter a valid option");
		
		}
		
		sc.close();
	}
}
