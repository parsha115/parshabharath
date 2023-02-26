package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test53 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.yahoo.com");
        driver.findElement(By.xpath("//div[contains(@title,'Mail')]")).click();
        try
        {
        	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        }
        catch(Exception ex)
        {
        	
        }
        driver.findElement(By.name("username")).sendKeys("parsharam115@yahoo.com");
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234SHOBHA");
        driver.findElement(By.name("verifyPassword")).click();
        driver.findElement(By.xpath("//a[text()='Compose']")).click();
        driver.findElement(By.xpath("(//input[contains(@role,'combobox')])[2]")).sendKeys("parsharam115@gmail.com");
        driver.findElement(By.xpath("//input[contains(@aria-label,'Subject')]")).sendKeys("Hai");
        driver.findElement(By.xpath("//div[contains(@aria-label,'Message body')]")).sendKeys("Good Morning \n Have the nice Day");
        driver.findElement(By.xpath("//span[text()='Send']")).click();
        String x=driver.findElement(By.xpath("//span[text()='message']/parent::a/parent::span")).getText();
        System.out.println(x);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        driver.get("http://www.gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        String y=driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[1]/td[4]/div[1]/span[1]/span")).getAttribute("email");
        System.out.println(y);
        if(y.contains("parsharam115@yahoo.com"))
        {
        	System.out.println("yahoo mail sent to gmail completely working");
        }
        else
        {
        	System.out.println("yahoo mail sent to gmail not completely working");
        }
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
        driver.switchTo().frame("account");
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        driver.close();
        driver.switchTo().window(l.get(0));
        driver.findElement(By.xpath("(//img[contains(@alt,'Profile image')])[1]")).click();
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        driver.quit();
	}

}
