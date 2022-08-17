package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage{
	WebDriver driver; 
	
	public AddCustomerPage (WebDriver driver) {
		this.driver = driver; 
	}
	@FindBy (how=How.XPATH, using="//h2[contains(text(), ' Contacts ')]")WebElement ADD_CONTACT;
	@FindBy (how=How.XPATH, using="//input[@ name ='account']")WebElement FULLNAME_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"cid\"]")WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"phone\"]")WebElement PHONE_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"address\"]")WebElement ADDRESS_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"city\"]")WebElement CITY_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"state\"]")WebElement STATE_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"zip\"]")WebElement ZIPCODE_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"select2-country-container\"]")WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy (how=How.XPATH, using="//*[@id=\"rform\"]/div[1]/div[1]/div[10]/div/span/span[1]/span/ul")WebElement TAG_ELEMENT;
	
	
	public void validateAddContact(String contact) {
		Assert.assertEquals(ADD_CONTACT.getText(), contact, "Add contact not available");
	}
	
	public void insertFullName (String fullname) {
		int genNum= generateRandomNo(999);
		FULLNAME_ELEMENT.sendKeys(fullname+ genNum);
	}
	

	public void sellectCompany (String company) {
		
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
	}
	

	public void insertEmail (String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(56)+ email);
		}
}
