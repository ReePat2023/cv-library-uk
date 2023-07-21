package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void acceptCookies() throws InterruptedException {
        switchToFrame("gdpr-consent-notice");
        clickOnElement(acceptCookies);
        switchToDefaultContent();
    }
    public void enterJobTitle(String jobTitle){
        Reporter.log("Enter Job title" + jobTitleField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Job title" + jobTitleField.toString());
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location){
        Reporter.log("Enter Location" + locationField.toString());
        CustomListeners.test.log(Status.PASS, "Enter Location" + locationField.toString());
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance){
        Reporter.log("Select Distance" + distanceDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select Distance" + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        Reporter.log("Click on more search options" + moreSearchOptionsLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on more search options" + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter Minimum salary" + salaryMin.toString());
        CustomListeners.test.log(Status.PASS, "Enter Minimum salary" + salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter Maximum salary" + salaryMax.toString());
        CustomListeners.test.log(Status.PASS, "Enter Maximum salary" + salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        Reporter.log("Select salary type from dropdown" + salaryTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select salary type from dropdown" + salaryTypeDropDown.toString());
        sendTextToElement(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        Reporter.log("Select job type" + jobTypeDropDown.toString());
        CustomListeners.test.log(Status.PASS, "Select job type" + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobsButton(){
        Reporter.log("Click on find jobs button" + findJobsBtn.toString());
        CustomListeners.test.log(Status.PASS, "Click on find jobs button" + findJobsBtn.toString());
        clickOnElement(findJobsBtn);
    }
}
