package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver; 
	
	//WebElement UserNameElement = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By UserNameField : We don't use it in POM
	public LoginPage (WebDriver driver) {
		this.driver = driver; 
	}
	
	@FindBy (how= How.XPATH, using="//*[@id=\"username\"]")WebElement USER_NAME_ELEMENT; 
	@FindBy (how= How.XPATH, using ="//*[@id=\"password\"]")WebElement PASSWORD_ELEMENT;
	@FindBy (how= How.XPATH,using= "/html/body/div/div/div/form/div[3]/button")WebElement SIGNIN_BUTTON_ELEMENT;
	
	public void insertUserName (String UserName) {
		USER_NAME_ELEMENT.sendKeys(UserName);
		
	}
	public void insertPassword ( String PassWord) {
		PASSWORD_ELEMENT.sendKeys(PassWord);
	}
	public void clickSiginButton () {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	// FOR THIS TECHNIQUES, WHEN YOU HAVE MANY LINE OF CODES AND IT BREAKS YOU WILL NOT KNOW WHERE THE ISSUE IS.
	public void performLogin (String UserName, String PassWord) {
		USER_NAME_ELEMENT.sendKeys(UserName);
		PASSWORD_ELEMENT.sendKeys(PassWord);
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
