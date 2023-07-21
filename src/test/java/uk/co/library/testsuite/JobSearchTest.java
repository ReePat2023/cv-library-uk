package uk.co.library.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;
@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException{

        homePage.acceptCookies();
        homePage.enterJobTitle("Tester");
        homePage.enterLocation("Harrow, Greater London");
        homePage.selectDistance("5 miles");
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary("30000");
        homePage.enterMaxSalary("500000");
        homePage.selectSalaryType("Per annum");
        homePage.selectJobType("Permanent");
        homePage.clickOnFindJobsButton();
        //Assert.assertTrue(resultPage.verifyTheResults(result),"Permanent Tester jobs in Harrow");
    }
}
