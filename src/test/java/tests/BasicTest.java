package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class BasicTest extends TestBase {


//    public static void main(String[] args) {
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.duotech.io/");
//
////        WebDriverManager.firefoxdriver().setup();
////        WebDriver driver = new FirefoxDriver();
////        driver.get("https://www.duotech.io/");
//
//
////        Faker faker = new Faker();
////        System.out.println(faker.address().firstName());
////        System.out.println(faker.address().lastName());
////        System.out.println(faker.business().creditCardNumber());
////        System.out.println(faker.chuckNorris().fact());
//
//    }
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

    @Test(groups ={"homepage","smoke","flaky"})

    public void verifyTitleTest() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        Assert.assertEquals(driver.getTitle(), "Web Orders Login");



    }

    @Test(groups ={"smoke"})
    public void verifyUrlTest() {

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        Assert.assertEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");



    }

//    @Test
//    public void testLoginWithValidCredentials() {
//
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB,"test",Keys.ENTER);
//
//        Assert.assertEquals(driver.getTitle(),"Web Orders");
//
//
//    }
//
//    @Test
//    public void testLoginWithInValidCredentials() {
//
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("ddf", Keys.TAB,"dfdfg",Keys.ENTER);
//
//        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));
//        Assert.assertTrue(errorMessage.isDisplayed());
//
//
//    }




}