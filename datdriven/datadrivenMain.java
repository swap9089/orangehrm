package datdriven;

import org.testng.annotations.Test;

public class datadrivenMain {
@Test(dataProvider="data",dataProviderClass=datadriven.class)
public void verify(String username,String password)
{
System.out.println(""+username);
System.out.println(""+password);

}
}
