package dataprovider;

import Driver.chromedriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class IATI_login_excel extends chromedriver {
    @Test(dataProviderClass = login_dataprovider.class, dataProvider ="data")
    public void signIn(String username,String password,String exp){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String act_title=driver.findElement(By.xpath("//h4[@class=\"mr-4 text-3xl font-bold xl:text-heading-4\"]")).getText();
        String exp_title="Your Activities";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //  String msg= driver.findElement(By.xpath("//span[@class=\"error text-xs\"]")).getText();
        //Assert.assertEquals(msg.contains("do not match our records"),true);

            if(exp.equals("Valid"))
            {
                if(exp_title.equals(act_title))
                {
                    driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]")).click();
                   driver.findElement(By.xpath("//button[@class=\"text-sm\"]")).click();
                    Assert.assertTrue(true);
                }
                else
                {
                    Assert.assertTrue(false);
                }
            }
            else if(exp.equals("Invalid"))
            {
                if(exp_title.equals(act_title))
                {
                    driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]")).click();
                    driver.findElement(By.xpath("//button[@class=\"text-sm\"]")).click();
                    Assert.assertTrue(false);
                }
                else
                {
                    Assert.assertTrue(true);
                }
            }

}

}
