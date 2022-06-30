package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ExecutionOrder {



//   enabled = false parameter is not going to execute test
    @Test (priority = 1000,enabled = false)
    public void loginTest1(){
        System.out.println("Test1");
    }

    @Test (priority = -4)
    public void asjfdf(){
        System.out.println("Test2");
    }

//    @Ignore is not going to execute test !
    @Ignore
    public void dhssa(){
        System.out.println("Test3");
    }

    @Test (priority = 5)
    public void loginTest2(){
        System.out.println("Test4");
    }


    @Test
    public void singupAndloginTest(){
        System.out.println("Test5");
    }

    @Test (priority = 5)
    public void fgsds(){
        System.out.println("Test6");
    }

}
