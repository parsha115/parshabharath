package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test30 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("Abdul");
		Thread.sleep(3000);
		driver.findElement(By.id("lname")).clear();
		driver.findElement(By.id("lname")).sendKeys("kalam");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[contains(@value,'Submit')]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
	}

}
