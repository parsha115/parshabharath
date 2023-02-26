package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test33 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='Compose']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("to")).sendKeys("essbharath@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("subjectbox")).sendKeys("Hi Bro");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Good Night \n Take care mama \n All the best for future \n Advance Happy Diwali");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[(text()='Send')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]")).click();
        Thread.sleep(3000);
        try
        {
        	driver.switchTo().frame("account");
        	driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        	driver.switchTo().defaultContent();
        }
        catch(NoSuchFrameException ex)
        {
        	driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        }
        Thread.sleep(3000);
        driver.close();
        
	}

}

