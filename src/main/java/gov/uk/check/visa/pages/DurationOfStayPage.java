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

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    public DurationOfStayPage() {PageFactory.initElements(driver, this);}



    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'6 months or less')]")
    WebElement sixMonthsOrLess;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement longerThanSixMonths;


    public void selectDurationOfStayBySwitch(String stay) {
        switch (stay.trim()) {
            case "6 months or less":
                clickOnElement(sixMonthsOrLess);
                log.info("selecting duration of stay : " +sixMonthsOrLess.toString());
                break;

            case "longer than 6 months":
                clickOnElement(longerThanSixMonths);
                log.info("selecting duration of stay : " +longerThanSixMonths.toString());
                break;
        }
    }


    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on login link : " + continueButton.toString());
    }
}
