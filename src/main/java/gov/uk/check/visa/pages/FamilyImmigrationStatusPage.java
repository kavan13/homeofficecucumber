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

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }





    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    WebElement yesRadiobtn;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'No')]")
    WebElement noRadiobtn;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public void selectImmigrationStatus(String status) {
        switch (status.trim()) {
            case "Yes":
                clickOnElement(yesRadiobtn);
                log.info("selecting Radio button : " +yesRadiobtn.toString());
                break;
            case "No":
                clickOnElement(noRadiobtn);
                log.info("selecting Radio button : " +noRadiobtn.toString());
                break;
        }
    }



    public void clickNextStepButton() {
        clickOnElement(continueButton);
        log.info("Clicking on next button : " + continueButton.toString());
    }
}
