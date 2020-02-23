package Run;

import org.testng.annotations.Test;

import Come.pages.Home;
import common.browsers;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Testdata extends browsers {
  @Test(dataProvider = "signin")
  public void f(Integer n, String s) {
	Home h=new Home(driver);
	h.emailidfield("zoha.kharazmi@yahoo.com");
	h.psswordfield("zh");
	h.loginbt();
	driver.navigate();
	
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] {3, "c"}
    };
  }
}
