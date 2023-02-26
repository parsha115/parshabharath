package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test40 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
	    driver.get("https://in.mail.yahoo.com");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(@alt,'Sign in')]")).click();
	    Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("parsharam115@yahoo.com");
        Thread.sleep(3000);
        driver.findElement(By.name("signin")).click();
        Thread.sleep(3000);  
        driver.findElement(By.name("password")).sendKeys("siri1234SHOBHA");
        Thread.sleep(3000);
        driver.findElement(By.name("verifyPassword")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[contains(@role,'combobox')])[2]")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[contains(@aria-label,'Subject')]")).sendKeys("hi");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Message body')]")).sendKeys("Im can do anything \n I can acheive anything \n i desrived myself" );
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Send']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])/parent::div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        Thread.sleep(3000);
        driver.quit();
	}

}

