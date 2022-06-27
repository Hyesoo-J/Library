package de.buw.se4de;

public class MainLoginFile {

	public static void main(String[] args) {
		
		IDandPassword iDandPassword=new IDandPassword();
		
		
		LoginPage loginPage=new LoginPage(iDandPassword.getLoginInfo());
		
		

	}

}
