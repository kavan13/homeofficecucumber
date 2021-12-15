package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;
      @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
      WebElement resultText;

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultText1;

    public String getResultMessage(){
      //  log.info("Geting result Messsage : " +resultMessage.toString());

        return resultMessage.getText().trim();
    }

    public void confirmResultMessage(String expectedMessage){
        Assert.assertTrue(getResultMessage().equals(expectedMessage), "Message did not match");
    }
    public String getResultMessage2(){
        log.info("Geting result Messsage2 : " +resultText.toString());

        return resultText.getText().trim();
    }

    public void confirmResultMessage2(String expectedMessage){
        Assert.assertTrue(getResultMessage2().equals(expectedMessage), "Message did not match");
    }
    public String getResultMessage3(){
        log.info("Geting result Messsage3 : " +resultText1.toString());

        return resultText1.getText().trim();
    }

    public void confirmResultMessage3(String expectedMessage){
        Assert.assertTrue(getResultMessage3().equals(expectedMessage), "Message did not match");
    }
}
