package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {
	@Test()

	public void verifylogin() {
		System.setProperty("WebDriver.gecko.driver", "./geckodriver/geckodriver.exe");

		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().window().setSize(new Dimension(300, 200));
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys("sn9089");
		dr.findElement(By.id("txtPassword")).sendKeys("sn9089");
screen.screenshot(dr, "login");		dr.findElement(By.id("btnLogin")).click();

	}

	@Test()

	public void verifylogin2() {
		System.setProperty("WebDriver.geckodriver.driver", "./geckodriver/geckodriver.exe");

		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.manage().window().setSize(new Dimension(300, 200));
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys("sn9099");
		dr.findElement(By.id("txtPassword")).sendKeys("sn9099");
		screen.screenshot(dr, "login1");
		dr.findElement(By.id("btnLogin")).click();

	}
}
