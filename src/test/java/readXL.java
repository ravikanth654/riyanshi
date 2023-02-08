import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class readXL
{
    @Test
    public void getValue() throws IOException 
    {
        File fs=new File("S:\\SeleniumNotesRiyanshi\\src\\main\\resources\\allData.csv.xlsx");
        FileInputStream fis=new FileInputStream(fs);
        XSSFWorkbook book=new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheetAt(0);
        Iterator<Row> sht = sheet.iterator();
        Row rows = sht.next();
        Cell cell = rows.getCell(0);
        String value = cell.getStringCellValue();
        System.out.println(value);
    }
}
