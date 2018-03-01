package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screen {
	public static void screenshot(WebDriver dr,String sc)
	{
	try {
		TakesScreenshot ts=(TakesScreenshot)dr;	
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./scnsht/"+sc+".png"));
	} catch (Exception e) {
	System.out.println(e);
		}

	}
}
