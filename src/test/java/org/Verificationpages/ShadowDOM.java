package org.Verificationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShadowDOM
{
    WebDriver driver;
    public ShadowDOM(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    @FindBy(xpath="//a[text()='Shadow DOM']")
    WebElement ShadowDOM;

    public void setShadowDOM() throws InterruptedException {
        ShadowDOM.click();
        Thread.sleep(30000);
    }
}
