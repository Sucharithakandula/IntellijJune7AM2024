package stepdefinitionfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utils.TestContext;

public class LearnMoreSteps {
    TestContext context;
    public LearnMoreSteps(TestContext context){
        this.context =context;
    }
    @Given("user click on confirmation box button")
    public void clickConfirmationBox(){

   context.pageObjectManager.getLearnMoreAlertPage().clickConfirmBoxButton();

    }

    @Then("user validate the alert message")
    public void userValidateTheAlertMessage() {

       String actual = context.pageObjectManager.getLearnMoreAlertPage().getAlertBoxText();
        Assert.assertEquals("Press a Button !",actual);
    }

    @And("user validate the UI message")
    public void userValidateTheUIMessage() {

        context.pageObjectManager.getLearnMoreAlertPage().clickCancelAlert();
        String ActualCancel = context.pageObjectManager.getLearnMoreAlertPage().getCancelTextMessageFromUI();
        Assert.assertEquals("You Pressed Cancel",ActualCancel);
    }

    @Given("user clicks on the change text button")
    public void userClicksOnTheChangeTextButton() {
      context.pageObjectManager.getLearnMoreExplicitPage().clickChangeTextButton();
    }

    @Then("user validate the change text value")
    public void userValidateTheChangeTextValue() {
       String msg = context.pageObjectManager.getLearnMoreExplicitPage().getTextChange();
        Assert.assertEquals("Hello, Learn More Aspirants",msg);
    }
}
