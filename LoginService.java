package com.cg.ecom.service;

import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.CredentialsException;
import com.cg.ecom.exception.LoginException;

public interface LoginService {

	public Login doLogin(String userid, String password) throws LoginException, CredentialsException;
}
