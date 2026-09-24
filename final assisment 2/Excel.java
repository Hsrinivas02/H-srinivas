package Last_Assesment_Task_2.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {

    public static String getData(int row, int cell) throws IOException {

        FileInputStream fis = new FileInputStream(
                "./src/test/java/Last_Assesment_Task_2/resc/Mind.xlsx"
        );

        Workbook wb = WorkbookFactory.create(fis);

        DataFormatter df = new DataFormatter();

        String data = df.formatCellValue(
                wb.getSheet("Sheet1")
                        .getRow(row)
                        .getCell(cell)
        );

        wb.close();
        fis.close();

        return data;
    }
}