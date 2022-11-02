package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class chromedriver {
    public WebDriver driver;
    @BeforeClass
    public void setproperty() {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://iatipublisher-dev.yipl.com.np/login");
        System.out.println("Setting the property of driver");
    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}


