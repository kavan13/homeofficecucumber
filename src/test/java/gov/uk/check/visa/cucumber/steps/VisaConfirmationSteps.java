package gov.uk.check.visa.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.*;

public class VisaConfirmationSteps {
    @Given("^I am on the Check UK visa website$")
    public void iAmOnTheCheckUKVisaWebsite() {
    }

    @And("^I start visa check$")
    public void iStartVisaCheck() {
        new StartPage().clickOnStartNow();
    }

    @When("^I select a nationality of 'Australia'$")
    public void iSelectANationalityOfAustralia() {
        new SelectNationalityPage().selectNationality("Australia");
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("^I select reason 'Tourism'$")

    public void iSelectReasonTourism() throws InterruptedException {
        Thread.sleep(1000);
        new ReasonForTravelPage().selectReasonForTravel("Tourism");
    }

//    @And("^I click on continue button$")
//    public void iClickOnContinueButton() {
//    }

    @Then("^I will be informed 'You will not need a visa to come to the UK'$")
    public void iWillBeInformedYouWillNotNeedAVisaToComeToTheUK() {
        new ResultPage().confirmResultMessage("You will not need a visa to come to the UK");
    }

    @When("^I select a nationality of 'Chile'$")
    public void iSelectANationalityOfChile() {
        new SelectNationalityPage().selectNationality("Chile");
    }

    @And("^I select reason 'Work'$")
    public void iSelectReasonWork() {
        new ReasonForTravelPage().selectReasonForTravel("Work, academic visit or business");
    }

    @And("^I state I am intending to stay for 'more' than (\\d+) months$")
    public void iStateIAmIntendingToStayForMoreThanMonths(int duration) {
        new DurationOfStayPage().selectDurationOfStayBySwitch("longer than 6 months");
    }

    @And("^I state I have planning to work 'health' types of job$")
    public void iStateIHavePlanningToWorkHealthTypesOfJob() {
        new WorkTypePage().selectJobType("Health and care professional");
    }

    @Then("^I will be informed 'You need a visa to work in health and care'$")
    public void iWillBeInformedYouNeedAVisaToWorkInHealthAndCare() {
        new ResultPage().confirmResultMessage2("You need a visa to work in health and care");
    }

    @When("^I select a nationality of 'Colombia'$")
    public void iSelectANationalityOfColombia() {
        new SelectNationalityPage().selectNationality("Colombia");
    }

    @And("^I select reason 'family'$")
    public void iSelectReasonFamily() {
        new ReasonForTravelPage().selectReasonForTravel("Join partner or family for a long stay");
    }

    @And("^I state My partner or family member have uk immigration status 'yes'$")
    public void iStateMyPartnerOrFamilyMemberHaveUkImmigrationStatusYes() {
        new FamilyImmigrationStatusPage().selectImmigrationStatus("Yes");
    }

    @Then("^I will be informed 'You’ll need a visa to join your family or partner in the UK'$")
    public void iWillBeInformedYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        new ResultPage().confirmResultMessage3("You’ll need a visa to join your family or partner in the UK");
    }
}
