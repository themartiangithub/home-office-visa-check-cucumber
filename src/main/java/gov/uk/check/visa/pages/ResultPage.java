package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @FindBy(xpath = "(//h2)[3]")
    WebElement resultMessage;

    public String getResultMessage() {
        log.info("getResultMessage " + resultMessage.toString());
        //CustomListeners.test.log(Status.PASS, "get ResultMessage " + resultMessage);
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage) {
        log.info("confirm ResultMessage " );
        //CustomListeners.test.log(Status.PASS, "confirm ResultMessage " );
        Assert.assertTrue(getResultMessage().equals(expectedMessage));
    }
}
