package tests2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import tests.TestBase;

import java.time.Duration;

public class DependencyTest {

    public WebDriver driver;

    @BeforeClass
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

    }


    @AfterClass
    public void tearDownClass() {
        driver.quit();
    }


    @Test
    public void testLoginWithValidCredentials() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

        Assert.assertEquals(driver.getTitle(), "Web Orders");


    }

    @Test(dependsOnMethods = {"testLoginWithValidCredentials"})
    public void DeleteSelected() {

        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        driver.findElement(By.name("ctl00$MainContent$btnDelete")).click();

        Assert.assertTrue(driver.findElement(By.id("ctl00_MainContent_orderMessage")).isDisplayed());

    }

    @Test(dependsOnMethods = {"DeleteSelected"})
    public void oneSelected() {

        driver.navigate().back();
        driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();

    }
}