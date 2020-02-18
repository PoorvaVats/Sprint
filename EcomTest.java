package com.cg.ecom.login;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.CredentialsException;
import com.cg.ecom.exception.LoginException;
import com.cg.ecom.service.LoginService;
import com.cg.ecom.service.LoginServiceImpl;

@TestInstance(Lifecycle.PER_CLASS)
public class EcomTest {
	
	@BeforeAll
	public static void  beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After all");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("After Each");
	}
	
	@Test
	public void testSeries1() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(LoginException.class, ()->{ser.doLogin("Poorva123", "qwerty");});
		System.out.println("Test 1 successful");
	}
	
    @Test
	public void testSeries2() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(LoginException.class, ()->{ser.doLogin("qwerty", "Poorva$123");});
		System.out.println("Test 2 successful");
	}
	
	@Test
	public void testSeries3() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(LoginException.class, ()->{ser.doLogin("qwerty", "qwerty");});
		System.out.println("Test 3 successful");
	}
	
	@Test
	public void testSeries4() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(CredentialsException.class, ()->{ser.doLogin("Poorva123", "");});
		System.out.println("Test 4 successful");
	}
	
	@Test
	public void testSeries5() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(CredentialsException.class, ()->{ser.doLogin("", "Poorva$123");});
		System.out.println("Test 5 successful");
	}
	
	@Test
	public void testSeries6() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(CredentialsException.class, ()->{ser.doLogin(" ", " ");});
		System.out.println("Test 6 successful");
	}
	
	@Test
	public void testSeries7() {
		LoginService ser = new LoginServiceImpl();
		assertThrows(CredentialsException.class, ()->{ser.doLogin("", "");});
		System.out.println("Test 7 successful");
	}
	
	@Test
	public void testSeries8() throws LoginException, CredentialsException {
		LoginService ser = new LoginServiceImpl();
		Login log = ser.doLogin("Poorva123", "Poorva$123");
		assertNotNull(log);
		System.out.println("Test 8 successful");
	}

}
