package tests;

import org.testng.annotations.*;

public class BeforeAndAfterAnnotations {




    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }

    @Test(groups = {"flaky"})
    public void Test1(){
        System.out.println("Test1");
    }

    @Test
    public void Test2(){
        System.out.println("Test2");
    }

    @Test
    public void Test3(){
        System.out.println("Test3");
    }















}
