package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class broken {
	@Test
	public void brkelink() {
		System.setProperty("WebDriver.geckodriver.driver", "./geckodriver/geckodriver.exe");

	WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com/");
		List<WebElement> links = dr.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifylink(url);
		}
	}

	public static void verifylink(String link) {
		try {

			URL url = new URL(link);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.connect();
			if (con.getResponseCode() == 200) {

				System.out.println(link + "-" + con.getResponseMessage());
			}

	if(con.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND){
		System.out.println(link+"-"+con.getResponseMessage()+"-"+HttpsURLConnection.HTTP_NOT_FOUND);
		
	}	} catch (Exception e) {
		}

	}

}
