package one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleMavenFirstScript {

	@Test
	public void sampleTest() throws InterruptedException
	{
		System.out.println("=============Sample TestNG Script===================");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		System.out.println("============"+driver.getTitle()+"=============");
		
		System.out.println("============SeleniumTestClass2 Executed========");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("============Task completed========");
	}
}
