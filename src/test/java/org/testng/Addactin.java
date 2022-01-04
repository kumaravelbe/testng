package org.testng;

import org.base.BaseClass;
import org.locators.HomePage;
import org.locators.Register;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Addactin extends BaseClass {

	HomePage h;
	Register r;

	@BeforeMethod
	private void tc1() {
		Chrome();
		LaunchUrl("https://adactinhotelapp.com/");
		maximize();

	}

	@Test(dataProvider = "testdata")
	private void tc3(String name, String pas, String cpas, String usname, String mail) throws InterruptedException {
		h = new HomePage();

		h.getNewuser().click();

		r = new Register();
		r.getUsername().sendKeys(name);
		r.getPassword().sendKeys(pas);
		r.getCpassword().sendKeys(cpas);
		r.getUsername().sendKeys(usname);
		r.getEmail().sendKeys(mail);
		Thread.sleep(3000);
	}

	@Parameters({ "username", "Password" })
	@Test
	private void tc2(String uname, @Optional("567888") String pass) {
		h = new HomePage();
		h.getUsername().sendKeys(uname);
		h.getPassword().sendKeys(pass);
		h.getLogin().click();
	}

	@AfterMethod
	private void tc4() {
		close();
	}

	@DataProvider(name = "testdata")
	public String[][] data() {

		return new String[][] { 
			{ "kumsi", "@123", "@123", "kumaravel", "kum@gmail.com" },
			{ "ffff", "@234", "@234", "FDES", "FDES@GMAIL.COM" } };
	}

}
