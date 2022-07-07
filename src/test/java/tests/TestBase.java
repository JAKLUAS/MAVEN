package tests;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestBase {


   public WebDriver driver;
   public SoftAssert softAssert;

//    @BeforeClass
//    public void setupClass(){
//        WebDriverManager.chromedriver().setup();
//        System.out.println("Test Base Before Class Method ");
//    }


// it would run before the group methods
//    @BeforeGroups(groups = {"flaky"},alwaysRun = true)
//    public void setupBeforeGroups(){
//        System.out.println("flaky test");
//    }

    @BeforeMethod(alwaysRun = true)
    public void setupMethod(){

        softAssert =  new SoftAssert();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
//        softAssert.assertAll();
    }



}
