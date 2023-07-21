package com.MeetSky.pages;

import com.MeetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage {
    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']")
    public WebElement filesModule;

    @FindBy(xpath = "//label[@for='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//span[text()='Знімок екрана 2023-07-18 о 7.38.19 пп']")
    public WebElement  downloadFile;

    @FindBy(xpath = "//span[text()='New folder']")
    public WebElement newFolder;
    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement papaFolder;

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-n']")
    public WebElement buttonName;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[10]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement threeDot;

    @FindBy(xpath = "//span[text()='Delete file']")
    public WebElement deleteFile;

    @FindBy(xpath = "//label[@id='view-toggle']")
    public WebElement butTog;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement buttonPlus;

    @FindBy(xpath = "//span[text()='11 folders and 21 files']")
    public WebElement spanFiles;
}
