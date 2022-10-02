package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TermsAndConditionObjects {
	public WebDriver driver;

	private By  Termsclick = By.xpath("//a[contains(text(),'Terms')]");
	
	
	
	public TermsAndConditionObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this. driver=driver2;
	}



	public WebElement Clickonterms() {
		return driver.findElement(Termsclick);

	}


}
