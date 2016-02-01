package bdd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Irina_Kartun on 2/1/2016.
 */
public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        driver = new FirefoxDriver();
        return driver;
    }

    public static void killDriver(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }

}

