package cmd_contact;

import org.testng.annotations.Test;

public class create_contactTest {

	@Test
	public void createContactWithMobileNumberTest() {
         
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
		
		System.out.println("contact is created using mobile number");
	}

	@Test
	public void createContactWithOutMobileNumberTest() {

		System.out.println("contact is created without mobile number");
	}
	
	@Test
	public void deleteContact() {

		System.out.println("contact is created without mobile number");
	}
}
