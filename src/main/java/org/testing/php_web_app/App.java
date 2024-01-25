package org.testing.php_web_app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
      //System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
     
       // WebDriverManager.chromedriver().setup();
	    
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeoptions = new ChromeOptions();
       
        chromeoptions.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(chromeoptions);
        driver.get("http://3.109.202.40:8085/register.html");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("admin@admin.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println("Test Scripts Ended");
          
    }
}
