package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test44 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Compose']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("to")).sendKeys("parsharam115@yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.name("subjectbox")).sendKeys("Good Morning");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[contains(@aria-label,'Message Body')])[1]")).sendKeys("All is well \n Very Happy this momment");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Send']")).click();
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(5000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(5000);
        driver.get("https://www.yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Sign In']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("parsharam115@yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.name("signin")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("siri1234SHOBHA");
        Thread.sleep(5000);
        driver.findElement(By.name("verifyPassword")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("ymail")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(l.get(0));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("account");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.quit();
        
        
	}

}
