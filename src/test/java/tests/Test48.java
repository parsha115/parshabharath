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

public class Test48 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        Thread.sleep(5000);
        driver.get("http://www.yahoo.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@title,'Mail')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("parsharam115@yahoo.com",Keys.TAB,Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.switchTo().activeElement().sendKeys("siri1234SHOBHA",Keys.TAB,Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[contains(@role,'combobox')])[2]")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[contains(@aria-label,'Subject')]")).sendKeys("HAPPY");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(@aria-label,'Message body')]")).sendKeys("Very Good Morning \n Happy with leaning selenium");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Send']")).click();
        Thread.sleep(2000);
        String x=driver.findElement(By.xpath("//span[text()='message']/parent::a/parent::span")).getText();
        System.out.println(x);
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
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
        driver.findElement(By.xpath("//a[text()='Sent']")).click();
        Thread.sleep(5000);
        String y=driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[1]/td[4]/div[1]/span[1]/span")).getAttribute("email");
        System.out.println(y);
       		if(y.contains("parsharam115@yahoo.com"))
       		{
       			System.out.println("Yahoo mail sent to Gmail completly working");
       		}
       		else
       		{
       			System.out.println(
       					"Yahoo mail sent to Gmail not completly working");
       		}
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("account");
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
        driver.switchTo().window(l.get(0));
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        Thread.sleep(5000);
        driver.close();
        Thread.sleep(5000);
        driver.quit();
	}

}
