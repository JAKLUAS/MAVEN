package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tests.TestBase;

public class loginTest2 extends TestBase {


    @BeforeClass
    public void setupClasslogin(){

        System.out.println("login Before Class Method ");
    }



    @Test(groups = {"smoke"})
    public void testLoginWithValidCredentials() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB,"test",Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Web Orders");


    }

    @Test(groups = {"homepage","flaky"})
    public void testLoginWithInValidCredentials() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("ddf", Keys.TAB,"dfdfg",Keys.ENTER);

        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
        Assert.assertTrue(errorMessage.isDisplayed());


    }

}
