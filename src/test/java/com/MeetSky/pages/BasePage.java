package com.MeetSky.pages;

import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']")
    public List<WebElement> allModules;

    /*
    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Dashboard']")
    public WebElement dashboardModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Photos']")
    public WebElement photosModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Activity']")
    public WebElement activityModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Talk']")
    public WebElement talkModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Mail']")
    public WebElement mailModule;


    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Calender']")
    public WebElement calenderModule;

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Notes']")
    public WebElement notesModule;

    @FindBy(xpath = "//div[@aria-label='Deck']")
    public WebElement deckModule;

    @FindBy(xpath = "//div[@aria-label='Tasks']")
    public WebElement tasksModule;
     */

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']")
    public WebElement contactsModule;

    @FindBy(xpath = "//a[@aria-label='Search']")
    public WebElement search;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notifications;

    @FindBy(css = ".icon-contacts.menutoggle")
    public WebElement contacts;

    @FindBy(css = "#settings")
    public WebElement profileSettings;

    @FindBy(xpath = "//a[@class='user-status-menu-item__header']//div//div")
    public WebElement profileName;

    @FindBy(xpath = "//a[@class='user-status-menu-item__header']")
    public WebElement viewProfileLink;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement statusLink;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement settingsLink;

    @FindBy(xpath = "//a[@href='/index.php/settings/help']")
    public WebElement helpLink;

    @FindBy(xpath = "//a[contains(normalize-space(), 'Log out')]")
    public WebElement logoutLink;

    @FindBy(xpath = "//div[@id='content']//h2")
    public WebElement greetingsText;

    @FindBy(xpath = "//a[text()='Customize']")
    public WebElement customizeLink;

    /**
     * Clicks on the module that you want to work on.
     * If the provided moduleName doesn't exist gives NoSuchElementException.
     */
    public void moduleSelection(String moduleName){
        moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();
        WebElement moduleToClick = Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[@aria-label='"+"moduleName"+"']"));
        moduleToClick.click();
    }


    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
    /*
    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    */



    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }

}
