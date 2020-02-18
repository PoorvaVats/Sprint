package com.cg.ecom.repo;

import java.util.HashMap;
import java.util.Map;

import com.cg.ecom.dto.Login;

public class LoginRepository{
	
	/***************Repository of existing users****************/
		public static Map<String, Login> cmap = new HashMap<>();
		
	    static {
	    	//ID of the user is key and values are of type Login having id, password, user name, role
	    	cmap.put("Poorva123", new Login("Poorva123", "Poorva$123", "Poorva", "admin"));    
	    	cmap.put("Keshav123", new Login("Keshav123", "Keshav$123", "Keshav", "user"));
	    	cmap.put("Pritam123", new Login("Pritam123", "Pritam$123", "Pritam", "user"));
	    	cmap.put("Rahhi123", new Login("Rahhi123", "Rahhi$123", "Rahhi", "user"));
	    	cmap.put("Sudheer123", new Login("Sudheer123", "Sudheer$123", "Sudheer", "user"));
	    	cmap.put("Sohail123", new Login("Sohail123", "Sohail$123", "Sohail", "user"));
	    }
	    
}
