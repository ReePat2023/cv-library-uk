package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"QA Tester", "Pinner", "15 miles", "35000", "400000", "Per month", "Contract", "Contract Qa Tester jobs in Pinner"},
                {"Automation Tester", "London", "7 miles", "40000", "300000", "Per week", "Permanent", "Permanent Automation Tester jobs in London"},
                {"Automation Engineer", "East London", "2 miles", "45000", "500000", "Per annum", "Part Time", "Part Time Automation Engineer jobs in East London"},
                {"QA Lead", "Victoria", "13 miles", "65000", "900000", "Per month", "Permanent", "Permanent Automation QA Lead jobs in Victoria"},
                {"QA Engineer", "Central London", "11 miles", "35000", "950000", "Per month", "Permanent", "Permanent QA Engineer jobs in Central London"},
                {"QA Test Lead", "Central London", "12 miles", "55000", "850000", "Per month", "Permanent", "Permanent QA Test Lead jobs in Central London"},
        };
        return data;
    }
}
