package ExpandValid;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ValidationPage
{
   public WebDriver driver;
    @BeforeSuite
    public void Launch()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
         driver=new ChromeDriver(co);

    }
    @BeforeTest
    public void LaunchWebsite()
    {
        driver.get("https://practice.expandtesting.com/");
        driver.manage().window().maximize();
    }

    @AfterTest
    public void killsession()
    {
        driver.quit();
    }
}
