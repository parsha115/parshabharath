package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test47 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        Thread.sleep(5000);
        driver.get("http://www.gmail.com");
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
        driver.findElement(By.name("subjectbox")).sendKeys("Hello");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Message Body')]")).sendKeys("How are Bro \n i'm good");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Send']")).click();
        Thread.sleep(2000);
        String x=driver.findElement(By.xpath("//span[text()='View message']/parent::span/parent::span")).getText();
        System.out.println(x);
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(5000);
        driver.get("http://www.yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@title,'Mail')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("parsharam115@yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.name("signin")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("siri1234SHOBHA");
        Thread.sleep(5000);
        driver.findElement(By.name("verifyPassword")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[text()='Spam'])[1]")).click();
        Thread.sleep(5000);
        String y=driver.findElement(By.xpath("//*[@data-test-id='virtual-list']/ul/li[3]/descendant::span[4]")).getAttribute("title");
        System.out.println(y);
		if(y.contains("parsharam115@gmail.com"))
		{
			System.out.println("Gmail mail sent to yahoo completly working");
		}
		else
		{
			System.out.println("Gmail mail sent to yahoo not completly working");
		}
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(l.get(0));
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("account");
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
        driver.quit();
	}

}
