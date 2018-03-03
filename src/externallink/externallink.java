package externallink;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class externallink {
	@Test
	public void veriftlink(){
		System.setProperty("WebDriver.gecko.driver", "./geckodriver/geckodriver.exe");

	WebDriver dr=new FirefoxDriver();
	dr.get("http://192.168.1.2/orangehrm/symfony/web/index.php/auth/login");					
	
	List<WebElement> href=dr.findElements(By.xpath("//*[@href]"));
	Iterator itr=href.iterator();
while (itr.hasNext())
{
WebElement val=(WebElement) itr.next();
System.out.println(val.getAttribute("href"));	

}
	
}

}
