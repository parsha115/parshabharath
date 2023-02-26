package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test45 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("parsharam115@gmail.com",Keys.TAB,"siri1234",Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(@aria-label,'Your profile')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Log Out']")).click();
        Thread.sleep(5000);
        driver.quit();
	}

}
