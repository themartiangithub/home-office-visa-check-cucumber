package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectLengthOfStay(String moreOrLess) {
        log.info("Select Length Of Stay" + moreOrLess);
        //CustomListeners.test.log(Status.PASS, "Select Length Of Stay" + moreOrLess);
        String duration = moreOrLess;
        switch(duration){
            case "more":
                clickOnElement(moreThanSixMonths);
                break;
            default:
                clickOnElement(lessThanSixMonths);
        }
    }

    public void clickNextStepButton() {
        log.info("click Next StepButton " + nextStepButton.toString());
        //CustomListeners.test.log(Status.PASS, "click Next StepButton " + nextStepButton);
        clickOnElement(nextStepButton);
    }


}



