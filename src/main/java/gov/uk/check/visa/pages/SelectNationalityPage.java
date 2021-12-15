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

public class SelectNationalityPage extends Utility {
   // private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());
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
        log.info("select Nationality : " +nationalityDropDown.toString());


    }

    public void clickNextStepButton(){
        clickOnElement(continueButton);
        log.info("click next button : " +continueButton.toString());

    }
}
