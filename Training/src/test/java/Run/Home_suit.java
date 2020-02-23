package Run;

import org.testng.annotations.Test;

import Come.pages.Home;
import common.browsers;

public class Home_suit extends browsers {
	
	@Test
	public void f() {
		Home h=new Home(driver);
		h.emailidfield("zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
		
	

}
}