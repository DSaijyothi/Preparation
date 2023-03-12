package VerificationPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class HeroHokkupHomePage {
    WebDriver driver;

    public HeroHokkupHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(partialLinkText = "Checkboxes")
    WebElement lock;

    @FindBy(xpath = "//input[@type='checkbox'][1]")
    WebElement ramp;

    public void setDriver()
    {
        lock.click();
        ramp.click();
    }


            }


