package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNowButton;


    public void clickStartNow(){
        log.info("Click On Start Now Button " + startNowButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click On Start Now Button \" +  " + startNowButton);
        clickOnElement(startNowButton);
    }
}
