package com.cg.ecom.ui;

import java.util.Scanner;

import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.CredentialsException;
import com.cg.ecom.exception.LoginException;
import com.cg.ecom.service.LoginService;
import com.cg.ecom.service.LoginServiceImpl;

public class UserInterface {
	
	/*
	 * Main method scans the value of id and password 
	 * if login of type Login, returned by the method doLogin(), is not null then Login successful message is printed
	 */
	public static void main(String[] args) throws LoginException, CredentialsException {
		Scanner scan = new Scanner(System.in);
		LoginService ser = new LoginServiceImpl();
		String uname;
		String pwd;
		System.out.println("Enter User ID");
		uname = scan.next();
		System.out.println("Enter Password");
		pwd = scan.next();
		
		Login login = ser.doLogin(uname, pwd);
		try {
			if(login != null) {
				System.out.println("Login Successful\nWelcome");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    scan.close();
	}

}
