package ValidationPage;

import VerificationPages.HeroHokkupHomePage;
import SeleniumBasePage.HeroHokkupBasePage;
import org.testng.annotations.Test;

public class HeroHokkupTestPage extends HeroHokkupBasePage
{
    HeroHokkupHomePage heroHokkupHomePage;

    @Test
    public void executeScript()  {
        heroHokkupHomePage=new HeroHokkupHomePage(driver);
        heroHokkupHomePage.setpath();
        heroHokkupHomePage.drop();
    }
}
