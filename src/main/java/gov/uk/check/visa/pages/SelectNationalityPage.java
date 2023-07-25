package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SelectNationalityPage extends Utility {

    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    /**
     * Select a Nationality 'Australia'
     * @param nationality
     * @throws InterruptedException
     */
    public void selectNationality(String nationality) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Select Nationality " + nationality.toString());
        //CustomListeners.test.log(Status.PASS, "Select Nationality" + nationality);
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    /**
     * Click on Continue button
     */
    public void clickNextStepButton(){
        log.info("Click On Next Button " + nextStepButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click On Next Button" + nextStepButton);
        clickOnElement(nextStepButton);
    }
}
