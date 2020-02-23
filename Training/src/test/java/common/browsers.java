package common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class browsers {
  public static WebDriver driver;
  
  @BeforeClass
	  public void beforeClass(String wbsite, String br) {
		  if(br.equalsIgnoreCase("chrome")) {
	  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\shara\\eclipse-workspace\\fnctional_offer\\src\\test\\java\\Training\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
		 }else if(br.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shara\\eclipse-workspace\\fnctional_offer\\src\\test\\java\\Training\\Drivers\\geckodriver.exe");
		 }
	  driver=new FirefoxDriver();
	  //driver.navigate().to("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
