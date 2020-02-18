package com.cg.ecom.service;

import com.cg.ecom.dao.LoginDao;
import com.cg.ecom.dao.LoginDaoImpl;
import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.CredentialsException;
import com.cg.ecom.exception.LoginException;

public class LoginServiceImpl implements LoginService{

	/**checks if the ID and password is not null and their length is greater than or equal to 1
	 * if yes then the credentials entered by the user are matched with the values in the repository through method in dao layer
	 * if no then CredentialsException is thrown
	 * if passwords do not match then LoginException is thrown**/
	LoginDao dao = new LoginDaoImpl();
	@Override
	public Login doLogin(String userId, String password) throws LoginException, CredentialsException {
		Login login = null;
		if(userId != " " && userId.length()>=1 && password != " " && password.length()>=1){
			 login = dao.getLoginDetails(userId);
			if(login.getPassword().equals(password)) {
				return login;
			}
			else throw new LoginException("Invalid Credentials");
		}else
			throw new CredentialsException();
	}

}
