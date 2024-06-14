package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
     WebDriver driver;

     public HomePage(WebDriver driver)
      {
         this.driver=driver;
     }
    public void enterProductName(String productname)
    {
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productname);
    }

    public void clickSeachButon()
    {
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    public void clickBabyWishList(){
        WebElement element = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Actions a = new Actions(driver);
        a.clickAndHold(element);
        driver.findElement(By.linkText("Baby Wishlist")).click();


    }
}
