package com.cg.ecom.dao;

import com.cg.ecom.dto.Login;
import com.cg.ecom.exception.LoginException;
import com.cg.ecom.repo.LoginRepository;

public class LoginDaoImpl implements LoginDao{

	/*Checks if the User ID passed in the method is present in the repository
	 *if yes then values mapped with the ID(type Login) are returned
	 *if no then LoginException is raised*/
	@Override
	public Login getLoginDetails(String userid) throws LoginException {
		if(LoginRepository.cmap.containsKey(userid)) {
			return LoginRepository.cmap.get(userid);
		}
		else throw new LoginException("Invalid User ID");
	}  

}
