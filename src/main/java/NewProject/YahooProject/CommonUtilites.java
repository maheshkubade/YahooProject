
package NewProject.YahooProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtilites {

	public static void AnyDropDownHandling(WebElement AnyDropDownXpath, String Countryvalue) {

		Select s = new Select(AnyDropDownXpath);
		s.selectByValue(Countryvalue);

	}

}
