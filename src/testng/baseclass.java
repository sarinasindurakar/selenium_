package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baseclass {
    public WebDriver driver;
  @BeforeClass
    public void setproperty() {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
      driver.get("https://iatipublisher-dev.yipl.com.np/login");
        System.out.println("Setting the property of driver");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
