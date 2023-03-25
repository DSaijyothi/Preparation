package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExpandRadioButtons
{
    WebDriver driver;
    public ExpandRadioButtons(WebDriver driver)
    {
        this.driver=driver;
    }
    By Link=By.xpath("//a[text()='Radio Buttons']");
    By Black=By.cssSelector("[id='black']");

    By BasketBall=By.id("basketball");
    public void setRadio() throws InterruptedException {
        driver.findElement(Link).click();
        Thread.sleep(3000);
        driver.findElement(Black).click();
        Thread.sleep(3000);
        driver.findElement(BasketBall).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);


    }

}
