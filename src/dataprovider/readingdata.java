package dataprovider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class readingdata {
    public static void main(String[] args)throws IOException {
        String excelFilePath="src/datafiles/dataprovider.xlsx";
        FileInputStream inputStream=new FileInputStream(excelFilePath);
        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        //Accessing the sheet rows and column
        //using for loop
         int rows=sheet.getLastRowNum();
        int cols= sheet.getRow(1).getLastCellNum();
        for( int r=0;r<=rows;r++){
            //getting the first row
            XSSFRow row=sheet.getRow(r) ;
            for(int c=0;c<cols;c++){
                //getting the rows column
                XSSFCell cell=row.getCell(c);
                //to get the type of the cell
                switch(cell.getCellType()){
                    case STRING:
                        System.out.print("\n"+cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print("\n"+cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print("\n"+cell.getBooleanCellValue());
                        break;

                }
                    System.out.print('|');
            }
            System.out.println();
        }

    }
}
