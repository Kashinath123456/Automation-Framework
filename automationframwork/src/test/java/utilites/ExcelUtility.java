package utilites;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    public static String getData(
            int row,
            int col) throws Exception {

        FileInputStream fis =
                new FileInputStream(
"./src/test/resources/testdata/LoginData.xlsx");

        XSSFWorkbook wb =
                new XSSFWorkbook(fis);

        XSSFSheet sheet =
                wb.getSheet("Sheet1");

        String data =
                sheet.getRow(row)
                      .getCell(col)
                      .getStringCellValue();

        wb.close();

        return data;
    }
}