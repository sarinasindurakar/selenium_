package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class webdriver {
     public WebDriver driver;
    @Test
    public void setproperty() {
        System.setProperty("webdriver.chrome.driver", "F:\\Internship-2022\\Automation\\chromedriver.exe");
         driver = new ChromeDriver();
        System.out.println("Setting the property of driver");
    }
}

