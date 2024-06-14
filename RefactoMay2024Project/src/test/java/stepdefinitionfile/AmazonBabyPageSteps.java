package stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.TestContext;

public class AmazonBabyPageSteps {
     TestContext context;
    public AmazonBabyPageSteps(TestContext context){
           this.context=context;
    }

    @Given("user clicks the baby wishlist from accounts and lists")
    public void clickBabyWishList()
    {
        context.pageObjectManager.getHomePage().clickBabyWishList();

    }

    @Then("user verify the navigation")
    public void userVerifyTheNavigation() {
       String actual = context.pageObjectManager.getBabyWishListPage().getPageTitle();
        Assert.assertEquals("",actual);
    }
}
