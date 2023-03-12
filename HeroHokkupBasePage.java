package SeleniumBasePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class HeroHokkupBasePage
{
     public WebDriver driver;

     @BeforeSuite
     public void Launch()
     {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
     }
     @BeforeTest
     public void LuanchWebsite()
     {
          driver.get("https://the-internet.herokuapp.com/");
          driver.manage().window().maximize();

     }
     @AfterTest
     public void killsession()
     {
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
          driver.quit();
     }
}
