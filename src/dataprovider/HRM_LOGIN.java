package dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HRM_LOGIN {
    WebDriver driver;

    @Test(dataProviderClass = logindata.class, dataProvider ="data")
    public void login(String usename, String password) {

        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(usename);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(@class,'oxd-button') ]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Sign In Credentials: " + "\n" +
                "  Username = " + usename + "\n" +
                "  Password = " + password + "\n" );

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actualResult = driver.findElement(By.xpath("//h6[.='PIM']")).getText();
        String expectedResult = "PIM";
        Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");

        driver.quit();

    }
};
