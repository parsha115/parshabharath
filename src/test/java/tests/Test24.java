package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@type,'password')]")).sendKeys("siri1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("to")).sendKeys("bushettyharika1999@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("subjectbox")).sendKeys("Hi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[(@aria-label='Message Body')]")).sendKeys("Good Morning \n Adavance Happy Diwali ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("account");
		driver.findElement(By.xpath("//div[text()='Sign out']")).click();
		Thread.sleep(3000);
		//driver.close();
		
	}

}
