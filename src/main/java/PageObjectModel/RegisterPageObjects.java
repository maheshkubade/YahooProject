package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import NewProject.YahooProject.BaseClass;

public class RegisterPageObjects {
	public WebDriver driver;
	private By FirstName = By.xpath("//input[@name='firstName']");
	private By LastName = By.xpath("//input[@name='lastName']");
	private By Email = By.xpath("//input[@id='usernamereg-userId']");
	private By createPassword = By.xpath("//input[@id='usernamereg-password']");
	private By EnterBirthYear = By.xpath("//input[@id='usernamereg-birthYear']");

	private By SignupcontinueButton = By.xpath("//button[@id='reg-submit-button']");
	private By EnterValidNumber = By.xpath("//input[@id='usernamereg-phone']");
	private By SelectCountryCode = By.xpath("//select[@type='select']");
	private By ClickOnSendcode = By.xpath("//button[@type='submit']");
	private By CheckBox = By.xpath("//div[@class='recaptcha-checkbox-checkmark']");

	public RegisterPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement EnterFirstName() {
		return driver.findElement(FirstName);

	}

	public WebElement EnterLastName() {
		return driver.findElement(LastName);
	}

	public WebElement EnterValidEmail() {
		return driver.findElement(Email);
	}

	public WebElement CreatePasswordl() {
		return driver.findElement(createPassword);
	}

	public WebElement Birthyear() {
		return driver.findElement(EnterBirthYear);
	}

	public WebElement cotinue() {
		return driver.findElement(SignupcontinueButton);
	}

	public WebElement EnterValidNumber() {
		return driver.findElement(EnterValidNumber);
	}

	public WebElement CountryCodeSelect() {
		return driver.findElement(SelectCountryCode);
	}

	public WebElement ClickOnSendeCode() {
		return driver.findElement(ClickOnSendcode);
	}

	public WebElement Checkbox() {
		return driver.findElement(CheckBox);
	}
}