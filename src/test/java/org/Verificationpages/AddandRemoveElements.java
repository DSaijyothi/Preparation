package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddandRemoveElements
{
    WebDriver driver;
    public AddandRemoveElements(WebDriver driver)
    {
        this.driver=driver;
    }
    By AddLink=By.xpath("//a[text()='Add/Remove Elements']");
    By AddElement=By.xpath("//button[text()='Add Element']");

    By delete=By.xpath("//button[text()='Delete']");
    public void Add() throws InterruptedException {
        driver.findElement(AddLink).click();
        Thread.sleep(3000);
        driver.findElement(AddElement).click();
        Thread.sleep(3000);
        driver.findElement(delete).click();
        Thread.sleep(3000);
        driver.navigate().back();

    }
}
