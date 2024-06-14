package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    WebDriver driver;


    public WikiPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getColOnevalue(){
       int colonesize = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::th")).size();
         List<String> Columnonevalues = new ArrayList<String>();

             for(int i =0; i<colonesize;i++){
             String val = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::th")).get(i).getText();
                 Columnonevalues.add(val);
             }
             return Columnonevalues;
    }

    public List<String> getColTwoValue(){
        int coltwosize = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::td")).size();
        List<String> Columtwovalues = new ArrayList<String>();

        for(int i =2; i<coltwosize;i++){
            String val = driver.findElements(By.xpath("//table[@class ='infobox vcard']/descendant::tr/child::td")).get(i).getText();
            Columtwovalues.add(val);
        }
        return Columtwovalues;

    }
}
