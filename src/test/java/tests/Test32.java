package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test32 {

	public static void main(String[] args) throws Exception
	{
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(4000);
		//fix text box in 1st outer frame
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("abdul kalam sir");
		//select check box in inner in 1st outer frame
	    driver.switchTo().frame("frame3");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    //back to page directly
	    driver.switchTo().defaultContent();
	    //click on drop down in 2nd outer frame 
	    driver.switchTo().frame("frame2");
	    driver.findElement(By.id("animals")).click();
	    //back to page directly
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);
	    //close site
	    driver.close();

	}

}
