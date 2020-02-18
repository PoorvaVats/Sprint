package com.cg.ecom.dao;

import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.LoginException;

public interface LoginDao {

	/*******Interface having a method that gets the login details from repository*******/
	public Login getLoginDetails(String userid) throws LoginException;
}
