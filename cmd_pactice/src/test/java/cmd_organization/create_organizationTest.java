package cmd_organization;

import org.testng.annotations.Test;

public class create_organizationTest {
	@Test
	public void createOrganizationTest() {
		
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		System.out.println("organization will be created");
	}

	@Test
	public void deleteOrganizationTest() {
		System.out.println("organization will be deleted");
	}
}
