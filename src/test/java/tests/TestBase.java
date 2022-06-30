package tests;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {


   public WebDriver driver;


//    @BeforeClass
//    public void setupClass(){
//        WebDriverManager.chromedriver().setup();
//        System.out.println("Test Base Before Class Method ");
//    }




    @BeforeMethod(timeOut = 5000)
    public void setupMethod(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
