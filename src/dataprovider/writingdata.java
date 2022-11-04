package dataprovider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writingdata {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Emp Info");
       Object  data[][]={{"ID","Name","Job"},
               {1,"sarina","qa"},
               {2,"Ainee","SE"},
               {3,"sdsd","wew"},
       };
       int rows= data.length;
       int cols=data[0].length;
       System.out.println(rows);
        System.out.println(cols);
        for(int r=0;r<rows;r++){
            XSSFRow row= sheet.createRow(r);
            for(int c=0;c<cols;c++){
                XSSFCell cell=row.createCell(c);
                Object values=data[r][c];
                if(values instanceof String)
                    cell.setCellValue((String)values);
                if(values instanceof Integer)
                    cell.setCellValue((Integer)values);
                if(values instanceof Boolean)
                    cell.setCellValue((Boolean)values);

            }
        }
        String filepath="src/datafiles/write.xlsx";
        FileOutputStream outstream=new FileOutputStream(filepath);
        workbook.write(outstream);

        outstream.close();
    }
}
