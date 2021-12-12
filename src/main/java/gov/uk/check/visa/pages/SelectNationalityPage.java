package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDown;

    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement continueButton;

    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityDropDown,nationality);
        Reporter.log("nationality '" + nationality + "' nationality <br>");

    }

    public void clickNextStepButton(){
        Reporter.log("Click on NextStep button" + "<br>");
        clickOnElement(continueButton);
    }
}
