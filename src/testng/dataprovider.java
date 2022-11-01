package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    @Test(dataProvider = "getdata")
        public void login (String email, String password)
        {
            System.out.println("  Email = " + email + "\n" +
                    "  Password = " + password );
        }
    @DataProvider
        public Object [] [] getdata ()
        {
            Object[][] data={ {"sarina@gmail.com","abc"},{"sja@gmail.com","asa"} };
            return data;
            /*Object [][] data = new Object [3][2];

            data [0][0] = "sarina@gmail.com";
            data [0][1] = "sarina";
            data [1][0] = "hello@gmail.com";
            data [1][1] = "123";
            data [2][0] = "jsjksd@gmail.com";
            data [2][1] = "12344";

            return data;

             */
        }
    }

