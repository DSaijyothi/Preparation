package GeneralStore;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GeneralStoreHomePage {
    AndroidDriver androidDriver;
    AppiumDriver appiumDriver;
    @Test
    public void LaunchApplication() throws IOException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\SaiJyothi D\\IdeaProjects\\GeneralStore\\src\\main\\resources\\General-Store.apk");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        androidDriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        androidDriver.findElement(AppiumBy.id("android:id/text1")).click();
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        androidDriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("saijyothi");
        androidDriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
        androidDriver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        androidDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        File formsome = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);
        String form = System.getProperty("User.dir" + "/screenshot/" + "formScreen.png");
        FileUtils.copyFile(formsome, new File(form));

    }
}
