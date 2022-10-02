package NewProject.YahooProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObjectModel.TermsAndConditionObjects;

public class TermsAndConditionCheckTestCase extends BaseClass {
	@Test
	public void TermsAndCondition() throws IOException, InterruptedException {
		AnybrowsernewLunch();
		
		driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
		//driver.switchTo().window(term)
	
		
		TermsAndConditionObjects tco=new TermsAndConditionObjects(driver);
		tco.Clickonterms().click();
		System.out.println(driver.getTitle());
		String ExpectedResultErrorMessage=TestCaseData.ExpectedTitleResult;
	String ActualResult=driver.getTitle();
	}

}
