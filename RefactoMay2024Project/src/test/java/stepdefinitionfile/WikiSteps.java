package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.TestContext;

public class WikiSteps {
    TestContext Context;

    public WikiSteps(TestContext Context){
        this.Context=Context;
    }

    @Given("user extracts the col one value")
    public void userExtractsColOneValue(){
        boolean flag = false;
     for(String k:Context.pageObjectManager.getWikiPage().getColOnevalue()){
         if(k.equals("Headquarters")){
            flag = true;
            break;
         }
     }
     Assert.assertTrue(flag);
    }

    @When("user extracts the col two value")
    public void userExtractsTheColTwoValue() {
     Context.pageObjectManager.getWikiPage().getColTwoValue();
    }

    @Then("validates the mapping")
    public void validatesTheMapping() {
       String actualcolone =  Context.pageObjectManager.getWikiPage().getColOnevalue().get(6);
       String actualcoltwo = Context.pageObjectManager.getWikiPage().getColTwoValue().get(6);

        Assert.assertEquals("Founded",actualcolone);
        Assert.assertEquals("2 July 1981; 42 years ago Pune, India",actualcoltwo);

    }
}
