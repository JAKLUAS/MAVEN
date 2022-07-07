package tests2;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.TestBase;
import utilites.CVSReader;


public class DatProviderDemo2 extends TestBase {

// (dataProvider = "usernamePassCombo")ilk testi calistirmak icin bu kodu girin  metodlari  bir bir calistir
    @Test (dataProvider = "usernamePassComboFile")

    public void testLoginWithInValidCredentials(String username, String password){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB, password, Keys.ENTER);


        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));

        Assert.assertTrue(errorMessage.isDisplayed());

    }

@DataProvider(name = "usernamePassCombo")
     public Object[][] getData() {

    return new Object[][]{
            {"afa", "dfkfd"},
            {"amina", "djsf"},
            {"majd", "dsijfdf"},
            {"lara", "djkdkd"}
    };
}

    @DataProvider(name = "usernamePassComboRandom")
    public Object[][] getData2() {

        Faker fake = new Faker();
        return new Object[][]{{"afa", "dfkfd"},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()},
                {fake.name().username(),fake.internet().password()}
        };
    }

    @DataProvider(name = "usernamePassComboFile")
    public Object[][] getData3() {

        Faker fake = new Faker();
        return CVSReader.readFromCSV("src/test/resources/data2.csv");
    }
}