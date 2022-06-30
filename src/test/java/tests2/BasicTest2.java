package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.TestBase;

import java.time.Duration;

public class BasicTest2 extends TestBase {


//    WebDriver driver;
//
//    @BeforeClass
//    public void setupClass(){
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @AfterClass
//    public void tearDownClass(){
//        System.out.println("Cleanup once after everything executed in the class");
//    }
//
//    @BeforeMethod
//    public void setupMethod(){
//
//
//         driver = new ChromeDriver();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//         driver.manage().window().maximize();
//
//    }
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

//    @Test
//    public void verifyTitleTest() {
//
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//
//        Assert.assertEquals(driver.getTitle(), "Web Orders Login");
//
//
//
//    }
//
//    @Test
//    public void verifyUrlTest() {
//
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//
//        Assert.assertEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//
//
//
//    }

    @Test
    public void testLoginWithValidCredentials() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB,"test",Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Web Orders");


    }

    @Test
    public void testLoginWithInValidCredentials() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("ddf", Keys.TAB,"dfdfg",Keys.ENTER);

        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
        Assert.assertTrue(errorMessage.isDisplayed());


    }




}