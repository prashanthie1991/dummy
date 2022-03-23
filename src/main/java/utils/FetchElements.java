package utils;
import base.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


//Program to re-use locators concept for different usecases

public class FetchElements {

    public WebElement getWebElement(String identifierType, String identifierValue){
        switch(identifierType){
            case "ID":
                return BaseClass.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseClass.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseClass.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseClass.driver.findElement(By.xpath(identifierValue));
            case "LINKTEXT":
                return BaseClass.driver.findElement(By.linkText(identifierValue));
            case "PARTIALLINKTEXT":
                return BaseClass.driver.findElement(By.partialLinkText(identifierValue));
            default: return null;
        }
    }

        public List<WebElement> getListWebElements(String identifierType, String identifierValue){
            switch(identifierType){
                case "ID":
                    return BaseClass.driver.findElements(By.id(identifierValue));
                case "CSS":
                    return BaseClass.driver.findElements(By.cssSelector(identifierValue));
                case "TAGNAME":
                    return BaseClass.driver.findElements(By.tagName(identifierValue));
                case "XPATH":
                    return BaseClass.driver.findElements(By.xpath(identifierValue));
                case "LINKTEXT":
                    return BaseClass.driver.findElements(By.linkText(identifierValue));
                case "PARTIALLINKTEXT":
                    return BaseClass.driver.findElements(By.partialLinkText(identifierValue));
                default:
                    return null;
            }
    }
}
