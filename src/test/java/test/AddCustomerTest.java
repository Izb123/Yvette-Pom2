package test;

import org.openqa.selenium.WebDriver;

import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;
	
	public void userShouldBeAbleToCreateCustomer() {
		driver= BrowserFactory.init();
		
	}
}
