package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generateRandomNo(int boundryNo) {
		Random rnd = new Random();
		int generatedNo= rnd.nextInt(boundryNo);
		return generatedNo;
		}
	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
}
