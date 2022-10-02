package NewProject.YahooProject;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObjects;

public class RegisterPageTestCase extends BaseClass {
	@Test
	public void loginPage() throws IOException, InterruptedException {
		AnybrowsernewLunch();
		driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
		
		RegisterPageObjects rpo=new RegisterPageObjects(driver);
		rpo.EnterFirstName().sendKeys(TestCaseData.FirstName);
		rpo.EnterLastName().sendKeys(TestCaseData.LastName);
		rpo.EnterValidEmail().sendKeys(TestCaseData.ValidMail);
		rpo.CreatePasswordl().sendKeys(TestCaseData.createpassword);
		rpo.Birthyear().sendKeys(TestCaseData.year);
		rpo.cotinue().click();
		Thread.sleep(2000);
		rpo.CountryCodeSelect().click();
		CommonUtilites.AnyDropDownHandling(rpo.CountryCodeSelect(), "IN");
		rpo.EnterValidNumber().sendKeys(TestCaseData.validNumber);
		
		rpo.ClickOnSendeCode().click();
	//Thread.sleep(3000);
		//rpo.Checkbox().click();
		
		
		
	//Disadvatages in selenium :-
		
	//	1)Selenium can not be automate catpcha code thats why this testcase is we can't test.
	}

}
