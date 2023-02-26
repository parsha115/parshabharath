package tests;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	public static void main(String[] args) 
	{
		// take browser name from keyboard
				Scanner sc=new Scanner(System.in);
		        System.out.println("Enter browser name");
		        String bn=sc.nextLine();
		        sc.close();
		        //open browser depends upon given name
		        RemoteWebDriver driver=null;  
		        //RemoteWebDriver driver;
		        if(bn.equals("chrome"))
		        {
		        	WebDriverManager.chromedriver().setup();
		            driver=new ChromeDriver();
		        }
		        else if(bn.equals("firefox"))
		        {
		        	WebDriverManager.firefoxdriver().setup();
		            driver=new FirefoxDriver();
		        }
		        else if(bn.equals("opera"))
		        {
		        	WebDriverManager.operadriver().setup();
		        	driver=new OperaDriver();
		        }
		        else if(bn.equals("edge"))
		        {
		        	WebDriverManager.edgedriver().setup();
		            driver=new EdgeDriver();
		        }
		        else
		        {
		        	System.out.println("Wrong browser name");
		            System.exit(0); //stop execution forcibly
		        }

	}

}
