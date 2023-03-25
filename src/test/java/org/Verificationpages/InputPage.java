package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class InputPage
{
    WebDriver driver;

    public InputPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath="//a[text()='Inputs']")
    WebElement Input;

    @FindBy(xpath = "//input[@id='input-number']")
    WebElement number;

    @FindBy(xpath="//input[@id='input-text']")
    WebElement text;

    @FindBy(xpath="//input[@type='password']")
    WebElement Password;
    @FindBy(xpath="//input[@id='input-date']")
    WebElement Calendar;
    By Display=By.xpath("//button[text()='Display Inputs']");

    By clear=By.xpath("//button[text()='Clear Inputs']");
    public void setDriver()
    {

        Input.click();
    }
    public void SetNumber(String s) throws InterruptedException {
    number.sendKeys("5");
    Thread.sleep(3000);
    }

    public void SetText(String s) throws InterruptedException {
        text.sendKeys("Saijyothi");
        Thread.sleep(3000);
    }
    public void Setpassword(String s) throws InterruptedException {
        Password.sendKeys("Saijyothi");
        Thread.sleep(3000);
    }

    public void setCalendar(String s) throws InterruptedException {
        Calendar.sendKeys("02-12-1997");
        Thread.sleep(3000);
    }
    public void setAll() throws InterruptedException {
        driver.findElement(Display).click();
        Thread.sleep(3000);
        driver.findElement(clear).click();
        Thread.sleep(3000);
       driver.navigate().back();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
