package org.Verificationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop
{
    WebDriver driver;
    public DragAndDrop(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Drag() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/drag-and-drop']")).click();

        Actions act=new Actions(driver);
        WebElement src=driver.findElement(By.xpath("//div[@id='column-a'and @draggable='true']"));
        WebElement des=driver.findElement(By.xpath("//div[@id='column-b'and @draggable='true']"));
        act.moveToElement(src)
                .pause(Duration.ofSeconds(2))
                .dragAndDrop(src,des)
                        .build()
                                .perform();

        driver.navigate().back();
        Thread.sleep(3000);
    }

}
