package listner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

import screenshot.screen;
@Listeners(listner.listner.class)

public class loginwidlistner {
	public void verifylogin() {
		System.setProperty("WebDriver.geckodriver.driver", "./geckodriver/geckodriver.exe");


		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().window().setSize(new Dimension(300, 200));
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys("sn9089");
		dr.findElement(By.id("txtPassword")).sendKeys("sn9089");
		dr.findElement(By.id("btnLogin")).click();

	}

}
