//in this program multiple tabs and multiple windows
//can be handle with a same program

package testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Thread.sleep(2000);

		String parentWndow = driver.getWindowHandle();
		System.out.println(parentWndow);

		Set<String> allWin = driver.getWindowHandles();
		for (String win : allWin) {
			//System.out.println(win);
			if (!win.equals(parentWndow)) {
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parentWndow);
		Thread.sleep(2000);
		driver.close();

	}

}
