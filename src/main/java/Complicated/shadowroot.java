package Complicated;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class shadowroot
{
    public WebDriver driver;
    @Test
    public void shadowRoot()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        driver.get("https://letcode.in/shadow");
        driver.manage().window().maximize();
        //using pageloadtimeout wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
        // finding locator during  shadowRoot is in open position
        String str="return document.querySelector('#open-shadow').shadowRoot.querySelector('#fname')";
        //using javascript executor
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement fname=(WebElement) ((JavascriptExecutor) driver).executeScript(str);
        fname.sendKeys("Saijyothi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();

    }


}
