package Testng;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	// TODO Auto-generated method stub
	@Test

	  public void verifyurl() {
    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
    driver.get("http://www.edureka.co");
    String x = driver.getCurrentUrl();
    System.out.println(x);
    Assert.assertEquals(x, "https://www.demo.co/");
}

@Test
public void verifytitle() {
  
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.edureka.co");
	String x = driver.getTitle();
	System.out.println(x);
	Assert.assertEquals(x, x); 
}

}
