package com.saucedemo.pages;

import com.saucedemo.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[@class='title']")
    WebElement productMessage;


    By listOfProduct = By.xpath("//div[@class='inventory_item']");


    /**
     * This method is used to get the title of homepage
     *
     * @return
     */
    public String getProductMessage() {
        log.info("Get product Text " + productMessage.toString());
        return getTextFromElement(productMessage);
    }

    /**
     * This method is used to get the list of product
     *
     * @return
     */
    public int getNumberofProductOnHomePage() {
        log.info("Get list of product " + listOfProduct.toString());
        List<WebElement> totalproduct = driver.findElements(listOfProduct);
        return totalproduct.size();
    }
}
