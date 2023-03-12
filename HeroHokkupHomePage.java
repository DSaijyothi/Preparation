package VerificationPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class HeroHokkupHomePage {
    WebDriver driver;

    public HeroHokkupHomePage(WebDriver driver)
    {
this.driver=driver;
    }
    public void some()  {
        driver.findElement(By.linkText("Dropdown")).click();
        WebElement drop=driver.findElement(By.id("dropdown"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Select trip=new Select(drop);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        trip.selectByVisibleText("Option 2");



    }
}
