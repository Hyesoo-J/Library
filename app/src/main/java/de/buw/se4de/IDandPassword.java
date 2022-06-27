package de.buw.se4de;

import java.util.HashMap;

public class IDandPassword {

	HashMap<String,String> logininfo=new HashMap<String,String>();
	
	IDandPassword(){
		logininfo.put("admin1","password1");
		logininfo.put("admin2","password2");
		logininfo.put("admin3","password3");
		
	}
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
