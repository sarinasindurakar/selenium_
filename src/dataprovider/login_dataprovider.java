package dataprovider;

import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class login_dataprovider {
    @DataProvider(name = "data")
    public static Object[][] getdata() throws IOException{

        /*Object [] [] data = new Object [4] [2];

        data [0] [0] = "admin";		        data [0] [1] = "admin123";
        data [1] [0] = "admin1234";			data [1] [1] = "12345678";
        data [2] [0] = "admin1234";			data [2] [1] = "admin123";
        data [3] [0] = "admin";		        data [3] [1] = "12345678";

        return data;
*/
/*
        String loginData[][] = {
               // {"admin@yourstore.com", "admin", "Valid"},
                //{"admin@yourstore.com", "adm", "Invalid"},
                //{"adm@yourstore.com", "admin", "Invalid"},
                //{"adm@yourstore.com", "adm", "Invalid"}
               //{"admin1234", "12345678", "Valid"},
               // {"admin", "1234", "Invalid"},
                //{"admin1234", "23232", "Invalid"},
                //{"admin", "12345678", "Invalid"}
        };
       // return loginData;
       */


        String path="src/datafiles/dataprovider.xlsx";
        XLUtility xlutil=new XLUtility(path);

        int totalrows=xlutil.getRowCount("Sheet1");
        int totalcols=xlutil.getCellCount("Sheet1",1);

        String loginData[][]=new String[totalrows][totalcols];


        for(int i=1;i<=totalrows;i++) //1
        {
            for(int j=0;j<totalcols;j++) //0
            {
                loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
            }

        }

        return loginData;
    }


    }



