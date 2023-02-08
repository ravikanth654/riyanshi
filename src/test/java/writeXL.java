import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.*;

public class writeXL
{
    @Test
    public static void write() throws IOException
    {
        File fs=new File("S:\\SeleniumNotesRiyanshi\\src\\main\\resources\\allData.csv.xlsx");
        FileInputStream fis=new FileInputStream(fs);
        XSSFWorkbook book=new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheetAt(0);
        XSSFRow row = sheet.createRow(1);
        XSSFCell cl = row.createCell(3);
        cl.setCellValue("ravikant");
        FileOutputStream fso=new FileOutputStream("S:\\SeleniumNotesRiyanshi\\src\\main\\resources\\allData.csv.xlsx");
        book.write(fso);
        fso.close();
    }
}
