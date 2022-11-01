package testng;

import org.testng.annotations.DataProvider;

public class logindata{
    @DataProvider(name = "data")
    public static Object [] [] getdata ()
    {
        Object [] [] data = new Object [2] [2];

        data [0] [0] = "Admin";		data [0] [1] = "admin123";
        data [1] [0] = "invalid";			data [1] [1] = "admin123";
        //data [2] [0] = "admin";			data [2] [1] = "admin123";
       // data [3] [0] = "NotValid";		data [3] [1] = "NotValid34";

        return data;
    }
}
