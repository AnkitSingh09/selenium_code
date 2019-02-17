package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;


public class verifytitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     WebDriver driver = new ChromeDriver(options);
		//WebElement driver = new WebElement(options);
	     driver.get("http://www.facebook.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ankitsingh_91@yahoo.in");
	    driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ankit[][]singh[][]0014");
	    driver.findElement(By.xpath("//input[contains(@data-testid, 'royal_login_button')]")).click();
		
	 //   driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("Vaishali Gupta"); //search via chat
	  //  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/form/button/i")).click();
	    //driver.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys(Keys.ENTER); //search via chat
	    
	   // driver.findElement(By.xpath("//a[@href='https://www.facebook.com/vaishali.gupta.56614?ref=br_rs']")).click();
	    //driver.findElement(By.xpath("//a[@href='/profile.php?id=100002621681226&amp;ref=br_rs']")).click();
	    driver.get("https://www.facebook.com/vaishali.gupta.56614?ref=br_rs");
	    
	    driver.findElement(By.xpath("//a[@href='/messages/t/vaishali.gupta.56614/']")).click();
	    
	    Thread.sleep(10);
	    try {
	   // driver.findElement(By.xpath("//textarea[contains(@class, 'uiTextareaNoResize uiTextareaAutogrow _2oj')]")).sendKeys("Hi"); //search via chat
	  //  driver.findElement(By.xpath("/html/body/div[29]/div[2]/div/div/div/div/div[3]/div/button")).click(); //search via chat
	    	driver.findElement(By.xpath("//div[contains(@class, '_1mf _1mj')]")).sendKeys("Hi"); //search via chat
		    
	    //driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/div/div/span/div/div/div[2]/div/div/div/div")).sendKeys("Hi"); //search via chat
    	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/ul/li[8]/a/svg/path")).click(); //search via chat
    	}
	    catch(Exception e) {
	    //	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/div/div/span/div/div/div[2]/div/div/div/div")).sendKeys("Hi"); //search via chat
	    //	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/ul/li[8]/a/svg/path")).click(); //search via chat
	    //	 driver.findElement(By.xpath("//textarea[contains(@class, 'uiTextareaNoResize uiTextareaAutogrow _2oj')]")).sendKeys("Hi"); //search via chat
	 	//    driver.findElement(By.xpath("/html/body/div[29]/div[2]/div/div/div/div/div[3]/div/button")).click(); //search via chat
	 	  e.printStackTrace();    
	    }
	    //driver.findElement(By.xpath("//div[contains(@class, '_1mf _1mj')]")).sendKeys("Hi"); //search via chat
	    
		   
	    //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[1]/div[2]/div/form/button/i")).click(); //search via chat
	    //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/a/div")).click(); //search via chat
		   
	    
	   // /html/body/div[1]/div[3]/div[1]/div/div[3]/div[2]/div/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/a/div
	 
	    		
	 // WebDriver wd = driver.findElement(By.xpath("//input[contains(@class, '_58al')]")).sendKeys("Vaishali Gupta");
	   // WebElement wd = driver.findElement(By.xpath("//input[contains(@class, '_58al')]"));
	   // wd.sendKeys("Vaishali Gupta");
	  //  wd.sendKeys(Keys.ENTER);
	   //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/a/div")).click(); //search via chat
	    //driver.findElement(By.xpath("//*[@id=\"u_0_e\"]")).click();
	    //driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[1]/div/div/div/div/div")).sendKeys("Vaishali Gupta");
	   //driver.findElement(By.xpath("//input[contains(@class, 'inputtext textInput')]")).sendKeys("Abhishek Singh"); //search via chat
	   // Actions actions = new Actions((WebDriver) wd);
	    //actions.sendKeys(Keys.ENTER).perform();
	   /*Point p1=null;
	   try {
	   p1 =driver.findElement(By.xpath("//img[contains(@oe, '5CF0F092')]")).getLocation(); //search via chat
	   }
	   catch (Exception e)
	   {
	   System.out.println("Points "+p1.x+"   "+p1.y);
	   }
	    //driver.findElement(By.id("js_1w")).sendKeys("Abhishek Singh");
	    */
	    
	    // driver.findElement(By.xpath("//input[contains(@class, '_58al')]")).sendKeys("Vaishali Gupta");
	    // driver.manage().timeouts().wait(25);
	    
		  //  driver.findElement(By.xpath("//input[contains(@class, '_58al')]")).sendKeys(Keys.ENTER);
	     //driver.findElement(By.xpath("//input[contains(@class, '_58al')]")).click();
	     //driver.manage().timeouts().wait(25);
	     //driver.findElement(By.xpath("//input[contains(@class, '_1mf _1mj')]")).click();
	     driver.findElement(By.xpath("//input[contains(@class, '_552h')]")).sendKeys("Hi");
	     
	     
	    //textbox.sendKeys(Keys.ENTER);
	    //placeholder="Search"
	    
	    //driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div[4]/div/div/div[2]/div[1]/span/label/input")).sendKeys("Vaishali Gupta");
	    //driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[5]/div/div/div/div/div/div[3]/div/div/div[2]/div/span/label/input")).sendKeys("Vaishali Gupta");
	    //driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/div[4]/div/div[1]/div/div/div/div/div/div[1]/div/div[2]/div[4]/div/div/div/span/div/div/div[2]/div/div/div/div")).sendKeys("Hi");
	   // driver.manage().timeouts().wait(25);
	 //   driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
	  //  driver.findElement(By.xpath("/html/body/div[27]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
	    
	    

	    
	    /*
	    driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@gmail.com");
	    driver.findElement(By.id("u_0_v")).sendKeys("demo@1234");
	    driver.findElement(By.id("day")).sendKeys("01");
	    driver.findElement(By.id("month")).sendKeys("12");
	    driver.findElement(By.id("year")).sendKeys("1992");
	    driver.findElement(By.id("u_0_7")).click();
	    driver.findElement(By.name("websubmit")).click();
	    */
	}

}
