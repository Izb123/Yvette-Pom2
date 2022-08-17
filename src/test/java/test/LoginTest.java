package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
// object and Inherit or By name of the class
	
	WebDriver driver; 
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver= BrowserFactory.init();
		//LoginPage loginePage1= new LoginPage();  we can't use the "new" keyword
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSiginButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		
		BrowserFactory.tearDown();
		
	}
	
	}
