package testFeature;

import org.testng.Assert;
import org.testng.annotations.Test;

import appFeature.AppLogin;

public class AppLoginFeatureTest {
	
	AppLogin apl = new AppLogin();
	
	@Test
	void test1() {
		boolean status = apl.login("admin", "admin");
		Assert.assertEquals(status, true);
	}
	
	@Test
	void test2() {
		boolean status = apl.login("123", "123");
		Assert.assertEquals(status, false);
	}

}
