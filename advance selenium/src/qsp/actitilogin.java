package qsp;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class actitilogin extends Generic{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert s = new SoftAssert();
		s.assertEquals(title, "actiTIME - Enter-Track");
		System.out.println("1");
		s.assertAll();
	}
	@Test
	public void submit() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}


}
