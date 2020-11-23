package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class GridExample {
    
    @Test
//    @Parameters("browserType")
    public void Grid() throws MalformedURLException{
        //DesiredCapabilities dr=null;
        //DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        //capabilities.setCapability("version","");
        //capabilities.setPlatform(Platform.LINUX);
    	ChromeOptions options = new ChromeOptions();
        RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.navigate().to("http://gmail.com");
        System.out.println(driver.getTitle());
       // driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
       // driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
        driver.close();
     
}
    @Test
    public void Grid1() throws MalformedURLException{
        //DesiredCapabilities dr=null;
       // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
       // capabilities.setCapability("version","");
      //  capabilities.setPlatform(Platform.LINUX);
    	FirefoxOptions options = new FirefoxOptions();
        RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
        driver.navigate().to("http://gmail.com");
        System.out.println(driver.getTitle());
        //driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
        // driver.findElement(By.xpath("//input[@id='Passwd']")) .sendKeys("password");
        driver.close();
     
}
    
    
    
    
}