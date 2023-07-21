package com.MeetSky.pages;

import com.MeetSky.utilities.BrowserUtils;
import com.MeetSky.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CustomizePage extends BasePage{

    public CustomizePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = ".modal__content>ol>li>label")
    public List<WebElement> allWidgets;

    @FindBy(xpath = "//div[@class='user-status-online-select']//label[text()]")
    public List<WebElement> allstatusWidgets;

    @FindBy(xpath = "(//div[@class='user-status-online-select']//label[text()])[2]")
    public WebElement awayButton;


    @FindBy(xpath = "//button[@class='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement customizeCloseButton;

    public void selectStatus(String status){
        //BrowserUtils.waitForVisibilityOf(allstatusWidgets);

        for (WebElement eachStatus : allstatusWidgets) {
            if (eachStatus.getText().contains(status)) {
                eachStatus.click();
                BrowserUtils.sleep(1);
            }
        }
    }

    public void allStatusVisibility(){
        for (WebElement eachStatus : allstatusWidgets) {
            eachStatus.isDisplayed();
        }
    }

    public void selectWidget(String widgetName){

        for (WebElement eachWidget : allWidgets) {


            if(eachWidget.getText().contains(widgetName)){
                    eachWidget.click();
            }
        }
    }


    public void allModulesVisibility(){
        for (WebElement eachModule : allModules) {
            eachModule.isDisplayed();
        }
    }



}
