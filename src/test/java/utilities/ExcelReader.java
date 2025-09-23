package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    public static String getvalueFromExcel(String sheetName, int row, int cellnor) throws IOException {

        FileInputStream fis = new FileInputStream("src/test/resources/TestData/tesData.xls");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheet(sheetName);

        Row rc = sheet.getRow(0);

        int rowCount = sheet.getLastRowNum();
        int colcount = rc.getLastCellNum();
        Object[][] data = new Object[rowCount][colcount];
        DataFormatter formatter = null;
        String value = "";
        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < colcount; j++) {
                Cell cell = rc.getCell(j);
                if (cell != null) {
                    value = cell.getStringCellValue();
                }
            }
        }
        return value;
    }
}