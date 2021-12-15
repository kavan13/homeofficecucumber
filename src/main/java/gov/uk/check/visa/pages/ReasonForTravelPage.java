package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//div//label")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;



    public void selectReasonForTravel(String reasonForTravel) {
        for (WebElement reason : reasonForVisitList) {
            if (reason.getText().equals(reasonForTravel)) {
                clickOnElement(reason);
             //   log.info("selecting Reason for travel : " +reasonForVisitList.toString());
                break;
            }
        }
    }
    public void clickNextStepButton(){
        clickOnElement(continueButton);
        log.info("selecting next step : " +continueButton.toString());
    }
}
