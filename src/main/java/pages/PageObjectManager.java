package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.MobileBy;

import java.util.Arrays;
import java.util.List;

public class PageObjectManager {
    protected WebDriver driver;
    protected Wait wait;
    protected int Timeout = 30;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    private void locatorType(String locatorType){
        String[] locatorTypes = {"id","name","xpath","classname","css","dom","linktext"};

        Assert.assertTrue(Arrays.asList(locatorTypes).contains(locatorType));
    }

    private By getByElement(String locatorType, String locatorName) {
        switch (locatorType.toLowerCase()) {
            case "id":
                return By.id(locatorName);
            case "name":
                return By.name(locatorName);
            case "xpath":
                return By.xpath(locatorName);
            case "classname":
                return By.className(locatorName);
            case "cssselector":
                return By.cssSelector(locatorName);
            case "linktext":
                return By.linkText(locatorName);
            case "partiallinktext":
                return By.partialLinkText(locatorName);
            case "accessibilityid":
                return MobileBy.AccessibilityId(locatorName); // <- Add this line
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
        }
    }

    /**
     * click an element
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     */
    protected void clickElement(String locatorType, String locatorName){
        waitElementToBeClickAble(locatorType,locatorName);
        driver.findElement(getByElement(locatorType,locatorName)).click();
    }

    /**
     * click an element
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     */
    protected boolean isElementDisplayed(String locatorType, String locatorName){
//        waitElementToBeClickAble(locatorType,locatorName);
        return driver.findElement(getByElement(locatorType,locatorName)).isDisplayed();
    }

    /**
     * type an element
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     * @param input
     */
    protected void SendKeysToInputField(String locatorType, String locatorName, String input){
        By by  = getByElement(locatorType,locatorName);
        driver.findElement(by).sendKeys(input);
    }

    /**
     *
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     */
    protected void waitElementToBeClickAble(final String locatorType, final String locatorName) {
        wait = new WebDriverWait(driver,Timeout);
        wait.until(ExpectedConditions.elementToBeClickable(getByElement(locatorType,locatorName)));
    }

    /**
     * click an element
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     */
    protected List<MobileElement> getListOfElements(String locatorType, String locatorName){
        waitElementToBeClickAble(locatorType,locatorName);
        return driver.findElements(getByElement(locatorType,locatorName));
    }

    /**
     * click an element
     * @param locatorType : ID,XPATH,NAME,CLASSNAME,CSSSELECTOR,LINKTEXT,PARTIALLINKTEXT
     * @param locatorName : name of locator
     */
    protected MobileElement getElement(String locatorType, String locatorName){
        waitElementToBeClickAble(locatorType,locatorName);
        return driver.findElement(getByElement(locatorType,locatorName));
    }


    protected String getTextString(String locatorType, String locatorName){
        return driver.findElement(getByElement(locatorType,locatorName)).getText();
    }
}
