package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    /**
     * Select reason 'Tourism'
     *
     * @param reason
     */
    public void selectReasonForVisit(String reason) {
        log.info("Select Reason For Visit ");
        //CustomListeners.test.log(Status.PASS, "Select Reason For Visit ");
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + reason + "')]"));
    }

    public void clickNextStepButton() {
        log.info("Click On Next Button " + nextStepButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click On Next Button" + nextStepButton);
        clickOnElement(nextStepButton);
    }

}
