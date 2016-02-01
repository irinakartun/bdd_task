package bdd;

import bdd.pom.EbayHome;
import bdd.pom.NavigationPanel;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)
public class Runner {

    @BeforeClass
    public static void initDriver() {
        WebDriver driver = Driver.getDriver();
        driver.get(EbayHome.EBAY_URL);
        NavigationPanel panel = new NavigationPanel(driver);
        panel.setLanguage("English");
        panel.goToHomePage();
    }


    @AfterClass
    public static void closeDriver(){
        Driver.killDriver();
    }


}

