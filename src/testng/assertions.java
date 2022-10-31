package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.concurrent.TimeUnit;

public class assertions {
    WebDriver driver;


    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver","F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
    }

    @Test(priority = 2)
    public void logo(){
        WebElement logo= driver.findElement(By.xpath("(//*[local-name()='svg' and @class='w-52 text-6xl sm:w-60'])"));
        Assert.assertTrue(logo.isDisplayed(),"The logo  is not displayed");

        System.out.println("The page title :"+driver.getTitle());

    }
    @Test(priority = 1)
    public void url(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement activities=driver.findElement(By.xpath("//h1[contains(@class,\"text-4xl\")]"));
        String actual=activities.getText();
        String expected="IATI Publisher";
        Assert.assertEquals(actual,expected);


    }
}
