package NewProject.YahooProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Properties proty;

	public WebDriver AnybrowsernewLunch() throws IOException {

		FileInputStream file = new FileInputStream(
			"C:\\Users\\mahes\\eclipse-workspace\\YahooProject\\src\\main\\java\\DataNew.properties");

		proty = new Properties();

		proty.load(file);

		String browserName = proty.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			// Firefox

		} else if (browserName.equalsIgnoreCase("Edge")) {

			// edge

		} else {

			System.out.print("not browser found");
		}
		return driver;
	}


}
