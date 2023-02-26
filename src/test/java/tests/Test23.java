package tests;

import org.openqa.selenium.By; 
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test23 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement type;
		driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
	    driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
	    Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("siri1234");
	    driver.findElement(By.xpath("//*[text()='Next']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[text()='Compose']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.name("to")).sendKeys("gandhenethra@gmail.com");
	    driver.findElement(By.name("subjectbox")).sendKeys("Hi");
	    driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Madam \n All the best for future");
	    driver.findElement(By.xpath("//div[text()='Send']")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]")).click();
	    Thread.sleep(4000);
	    driver.switchTo().frame("account");
	    driver.findElement(By.xpath("//div[text()='Sign out']")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}
