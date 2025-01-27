package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class LaunchBrowser {
	@Test
	public void m2() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/testng-team/testng-eclipse");
		driver.manage().window().maximize();

	}

}
