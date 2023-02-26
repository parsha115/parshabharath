package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test46 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("http://www.yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.id("ymail")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("parsharam115@yahoo.com",Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("siri1234SHOBHA",Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[contains(@role,'combobox')])[2]")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@aria-label,'Subject')]")).sendKeys("Hello");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Message body')]")).sendKeys("Good Afternoon \n Happy to see and all the best \nThanking you");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Send']")).click();
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(5000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(5000);
        driver.get("http://www.gmail.com");
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("parsharam115@gmail.com",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("siri1234",Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("account");
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(l.get(0));
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.quit();
	}

}
