package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement resultText;
    public String verifyTheResults(String expected){
        Reporter.log("Verify the Result" + resultText.toString());
        CustomListeners.test.log(Status.PASS, "Verify the Result" + resultText.toString());
        return getTextFromElement(resultText);
    }

}
