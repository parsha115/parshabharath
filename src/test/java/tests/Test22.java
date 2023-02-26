package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test22 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        WebElement e=driver.findElement(By.id("identifierId"));
        e.sendKeys("parsharam115@gmail.com");
        driver.findElement(By.xpath("//*[@id='identifierNext']")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("siri1234");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(4000);
		driver.close();
	}

}
