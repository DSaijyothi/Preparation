package VerificationPages;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HeroHokkupHomePage {
    WebDriver driver;

    public HeroHokkupHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(linkText = "Drag and Drop")
    WebElement Drag;
    //Drag and drop


    public void setpath() {
        Drag.click();
    }

public void drop()  {
    Actions actions=new Actions(driver);
    WebElement element=driver.findElement(By.id("content"));
    actions.dragAndDrop(driver.findElement(By.xpath("//div[@class='column' and @id='column-a']//child::header")),driver.findElement(By.xpath("//div[@class='column' and @id='column-b']//child::header"))).clickAndHold().build().perform();
    driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
}

}
