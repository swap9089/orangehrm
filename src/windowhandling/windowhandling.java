package windowhandling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class windowhandling {
	@Test
	public void verifyadmin() throws Exception {
		System.setProperty("WebDriver.gecko.driver", "./geckodriver/geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.naukri.com/");
		String parent = dr.getWindowHandle();
		dr.get("https://www.google.com/");
		Set<String> windowhandles = dr.getWindowHandles();
		ArrayList<String> win = new ArrayList<String>(windowhandles);
		for (int j = 1; j < win.size(); j++) {
			dr.switchTo().window(win.get(j));
			Thread.sleep(3000);
			dr.close();

		}

		dr.switchTo().window(parent);
		dr.close();

	}
}
