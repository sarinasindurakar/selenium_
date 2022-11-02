package dataprovider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IATI_dataprovider {
    WebDriver driver;

    @Test(dataProviderClass = login_dataprovider.class, dataProvider ="data")
    public void login(String usename, String  password) {

        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();

        driver.get("https://iatipublisher-dev.yipl.com.np/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("username")).sendKeys(usename);
        driver.findElement(By.id("password")).sendKeys(password);

       driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Sign In Credentials: " + "\n" +
                "  Username = " + usename + "\n" +
                "  Password = " + password + "\n" );

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement activities=driver.findElement(By.xpath("//h4[text()=' Your Activities ']"));
        Assert.assertTrue(activities.isDisplayed(),"The heading is not displayed");

        driver.quit();

    }
};
