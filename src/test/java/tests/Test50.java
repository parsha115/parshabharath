package tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test50 {

	public static void main(String[] args) throws Exception
	{
	     WebDriverManager.chromedriver().setup();
         RemoteWebDriver driver=new ChromeDriver();
         Thread.sleep(3000);
         driver.manage().window().minimize();
         Thread.sleep(5000);
         driver.manage().window().maximize();
         Thread.sleep(5000);
         Dimension d=driver.manage().window().getSize();
         System.out.println(d.getWidth());
         System.out.println(d.getHeight());
         Thread.sleep(5000);
         Dimension e=new Dimension(300,400);
         driver.manage().window().setSize(e);
         Thread.sleep(5000);
         Point p=driver.manage().window().getPosition();
         System.out.println(p.getX());
         System.out.println(p.getY());
         Thread.sleep(5000);
         Point q=new Point(200,200);
         driver.manage().window().setPosition(q);
         Thread.sleep(5000);
         driver.manage().window().fullscreen();
         Thread.sleep(5000);
         Robot r=new Robot();
         r.keyPress(KeyEvent.VK_ESCAPE);
         r.keyRelease(KeyEvent.VK_ESCAPE);
         Thread.sleep(5000);
         driver.quit();
	}

}
