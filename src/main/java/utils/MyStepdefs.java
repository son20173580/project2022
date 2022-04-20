package utils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {

    public static WebDriver driver = null;

    @Given("^clear all data$")
    public void cleanAllData() {
    }

    @And("^buyer open shop on storefront$")
    public void openShopOnStoreFront() {

        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        driver.get("https://import-product.onshopbase.com");


    }

}
