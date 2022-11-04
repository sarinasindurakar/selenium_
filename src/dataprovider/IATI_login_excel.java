
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
    @Test(dataProviderClass = login_dataprovider.class, dataProvider = "data")
    public void signIn(String username, String password, String exp) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement user = driver.findElement(By.id("username"));
        user.clear();
        user.sendKeys(username);

        WebElement pass = driver.findElement(By.id("password"));
        pass.clear();
        pass.sendKeys(password);
        driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String act_title = this.driver.findElement(By.xpath("//h4[@class=\"mr-4 text-3xl font-bold xl:text-heading-4\"]")).getText();
        String exp_title = "Your Activities";
        Assert.assertEquals(act_title, exp_title, "There is error");
        //driver.quit();
        // this.driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        if (exp.equals("Valid")) {
            if (exp_title.equals(act_title)) {
                this.driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]")).click();
                this.driver.findElement(By.xpath("//button[@class=\"text-sm\"]")).click();
                Assert.assertTrue(true);
               // Thread.sleep(200);
            } else {
                Assert.assertTrue(false);
                //Thread.sleep(200);
            }
        } else if (exp.equals("Invalid")) {
            if (exp_title.equals(act_title)) {
                this.driver.findElement(By.xpath("//button[@class=\"button secondary-btn dropdown-btn\"]")).click();
                this.driver.findElement(By.xpath("//button[@class=\"text-sm\"]")).click();
                Assert.assertTrue(false);
               /// Thread.sleep(200);
            } else {
                Assert.assertTrue(true);
               // Thread.sleep(200);
            }
        }

    }


}





