package ExpandTest;

import ExpandValid.ValidationPage;
import org.Verificationpages.*;
import org.testng.annotations.Test;

public class ExpandTestPage extends ValidationPage
{
    InputPage inputPage;
    ExpandRadioButtons expandRadioButtons;
    AddandRemoveElements addandRemoveElements;
    DragAndDrop dragAndDrop;
    BrowserInformation browserInformation;

    DynamicTable dynamicTable;
    ShadowDOM shadowDOM;



    @Test(priority = 1)
    public void Scenario1() throws InterruptedException {
        inputPage = new InputPage(driver);
        inputPage.setDriver();
        inputPage.SetNumber("");
        inputPage.SetText("");
        inputPage.Setpassword("");
        inputPage.setCalendar("");
        inputPage.setAll();
    }

        @Test(priority = 2)
        public void Scenario2() throws InterruptedException {
        expandRadioButtons=new ExpandRadioButtons(driver);
        expandRadioButtons.setRadio();
        }
        @Test(priority = 3)
    public void Scenario3() throws InterruptedException {
    addandRemoveElements=new AddandRemoveElements(driver);
    addandRemoveElements.Add();
    }
      @Test(priority = 4)
    public void Scenario4() throws InterruptedException {
    dragAndDrop=new DragAndDrop(driver);
    dragAndDrop.Drag();
}
@Test(priority = 5)
    public void Scenario5() throws InterruptedException {
    browserInformation=new BrowserInformation(driver);
    browserInformation.setBrowserInformation();
}

@Test(priority = 6)
    public void Scenario6() throws InterruptedException {
    dynamicTable = new DynamicTable(driver);
    dynamicTable.setDynamiclink();
}
    @Test(priority = 7)
            public void Scenario7() throws InterruptedException {
        shadowDOM=new ShadowDOM(driver);
        shadowDOM.setShadowDOM();
    }
}




