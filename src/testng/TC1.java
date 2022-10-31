package testng;

import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    public void openbrowser() {
        System.out.println("open the chrome browser");
    }

    @AfterClass
    public void closebrowser() {
        System.out.println("close the chrome browser");
    }

    @BeforeMethod
    public void signin() {
        System.out.println("Sign in to application");
    }

    @AfterMethod
    public void signout() {
        System.out.println("Sign outof application");
    }

    @Test
    public void test1() {
        System.out.println("This is test1.");
    }

    @Test
    public void test2() {
        System.out.println("This is test2.");
    }

    @BeforeTest
    public void click() {
        System.out.println("this is before test");
    }

    @AfterTest
    public void done() {
        System.out.println("this is after test");
    }

    @BeforeSuite
    public void suite() {
        System.out.println("this is beforesuite");
    }

    @AfterSuite
    public void suites() {
        System.out.println("this is aftersuite");
    }

}
