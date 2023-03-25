package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicTable
{
    WebDriver driver;
    public DynamicTable(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath="//a[text()='Dynamic Table']")
    WebElement dynamiclink;
    public void setDynamiclink() throws InterruptedException {
        dynamiclink.click();
        Thread.sleep(30000);
        String text=driver.findElement(By.xpath("//h1[text()='Dynamic Table']")).getText();
        System.out.println(text);
        String text1=driver.findElement(By.xpath("//div[@class='row']//p")).getText();
        System.out.println(text1);
        String text2=driver.findElement(By.xpath("//div[@class='container'][1]")).getText();
        System.out.println(text2);
        Thread.sleep(3000);
driver.navigate().back();
        Thread.sleep(3000);

    }
}
