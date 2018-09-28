package newdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import scrnshot.screen;

public class login {
	WebDriver dr;

	@Test(dataProvider = "logindata", dataProviderClass = login.class)
	public void verifylogin(String username, String password) throws Exception {
		exceld ex = new exceld();
		int c = ex.getcolcount(0);
		System.setProperty("webdriver.gecko.driver", ".//gecko//geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("https://benchmarking-qa.azurewebsites.net/");
		System.out.print("username:-" + username + "\t");
		Thread.sleep(1000);
		System.out.println("password:-" + password);
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys(username);
		Thread.sleep(1000);

		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[2]/div[2]/div/button")).click();
		for (int i = 0; i < c; i++) {
			screen.scr(dr, "pic" + (i));
		}
	}

	@DataProvider(name = "logindata")
	public String[][] setdata() throws Exception {
		exceld ex = new exceld();
		int r = ex.getrowcount(0);
		int c = ex.getcolcount(0);
		String[][] data = new String[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				data[i][j] = ex.getdata(0, i, j);
				data[i][j] = ex.getdata(0, i, j);
			}
		}
		return data;
	}

	@AfterMethod
	public void aftermethode() throws InterruptedException {

		Thread.sleep(1000);
		dr.close();
	}
}
