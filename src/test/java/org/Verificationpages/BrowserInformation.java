package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserInformation
{
    WebDriver driver;
    public BrowserInformation(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath="//a[text()='My Browser Information']")
    WebElement Broke;
    //@FindBy(xpath = "//button[text()='Show Browser Information']")
   // WebElement Info;
    @FindBy(xpath="//button[text()='Hide Browser Information']")
    WebElement hide;
    public void setBrowserInformation() throws InterruptedException {
        Broke.click();
        Thread.sleep(3000);
        //Info.click();
        Thread.sleep(3000);
        WebElement text=driver.findElement(By.xpath("//button[text()='Show Browser Information']"));
        text.click();
        String text1=driver.findElement(By.xpath("//table[@class='table table-bordered']//tbody//following::tr//child::td//following::tr//following-sibling::tr//following-sibling::tr//following-sibling::tr")).getText();
      System.out.println(text1);
     Thread.sleep(30000);
hide.click();
driver.navigate().back();
        Thread.sleep(3000);

    }
}
