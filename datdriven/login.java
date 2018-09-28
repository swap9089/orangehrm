package datdriven;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class login {
	@Test(dataProvider="Login",dataProviderClass=abstractx.class)
	public void verifylogin(String a,String b){
		System.setProperty("webdriver.gecko.driver","./gecko/geckodriver.exe");

		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		//dr.manage().window().setSize(new Dimension(300, 200));
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys(a);
		dr.findElement(By.id("txtPassword")).sendKeys(b);
		//dr.findElements(By.id("btnLogin")).
		dr.findElement(By.id("btnLogin")).click();
	
	}


}