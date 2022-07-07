package qsp;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void compose()
	{
		Reporter.log("compose",true);
	}
	@Test(dependsOnMethods ="compose")
	public void sentItems()
	{
		Reporter.log("sentitems",true);
		Assert.fail();
	}
	@Test(dependsOnMethods ="sentItems")
	public void trash()
	{
		Reporter.log("trash",true);
	}

}
