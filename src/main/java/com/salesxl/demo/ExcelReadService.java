package com.salesxl.demo;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcelReadService {

    @Autowired
    SaveCurrencyDataToDb repo;

    public List<Snoc> ReadDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException {

        String path = "C:\\Users\\BLACK-LENOVO\\Downloads\\sampleInput.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(path));
        // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        System.out.println("Retrieving Sheets using for-each loop");
        for (Sheet sheet : workbook) {
            System.out.println("=> " + sheet.getSheetName());

            DataFormatter dataFormatter = new DataFormatter();
            for (Row row : sheet) {


                String omc_guj_i = String.valueOf(row.getCell(0));
                String short_name = String.valueOf(row.getCell(1));
                String omc_name = String.valueOf(row.getCell(2));
                String ne_release = String.valueOf(row.getCell(3));
                String ne_state = String.valueOf(row.getCell(4));
                String kpr = String.valueOf(row.getCell(5));

                String date=row.getCell(6).toString();

                float d1_00 = (float) row.getCell(7).getNumericCellValue();
                float d1_01 = (float) row.getCell(8).getNumericCellValue();
                float d1_02 = (float) row.getCell(9).getNumericCellValue();
                float d1_03 = (float) row.getCell(10).getNumericCellValue();
                float d1_04 = (float) row.getCell(11).getNumericCellValue();
                float d1_05 = (float) row.getCell(12).getNumericCellValue();
                float d1_06 = (float) row.getCell(13).getNumericCellValue();
                float d1_07 = (float) row.getCell(14).getNumericCellValue();
                float d1_08 = (float) row.getCell(15).getNumericCellValue();
                float d1_09 = (float) row.getCell(16).getNumericCellValue();
                float d1_10 = (float) row.getCell(17).getNumericCellValue();
                float d1_11 = (float) row.getCell(18).getNumericCellValue();
                float d2_00 = (float) row.getCell(19).getNumericCellValue();
                float d2_01 = (float) row.getCell(20).getNumericCellValue();
                float d2_02 = (float) row.getCell(21).getNumericCellValue();
                float d2_03 = (float) row.getCell(22).getNumericCellValue();
                float d2_04 = (float) row.getCell(23).getNumericCellValue();
                float d2_05 = (float) row.getCell(24).getNumericCellValue();
                float d2_06 = (float) row.getCell(25).getNumericCellValue();
                float d2_07 = (float) row.getCell(26).getNumericCellValue();
                float d2_08 = (float) row.getCell(27).getNumericCellValue();
                float d2_09 = (float) row.getCell(28).getNumericCellValue();
                float d2_10 = (float) row.getCell(29).getNumericCellValue();
                float d2_11 = (float) row.getCell(30).getNumericCellValue();


                Snoc converter = new Snoc();

                converter.setOmc_guj_i(omc_guj_i);
                converter.setShort_name(short_name);
                converter.setOmc_name(omc_name);
                converter.setNe_release(ne_release);
                converter.setNe_state(ne_state);
                converter.setKpr(kpr);
                converter. setDate(date);
                converter.setD1_00(d1_00);
                converter.setD1_01(d1_01);
                converter.setD1_02(d1_02);
                converter.setD1_03(d1_03);
                converter.setD1_04(d1_04);
                converter.setD1_05(d1_05);
                converter.setD1_06(d1_06);
                converter.setD1_07(d1_07);
                converter.setD1_08(d1_08);
                converter.setD1_09(d1_09);
                converter.setD1_10(d1_10);
                converter.setD1_11(d1_11);

                converter.setD2_00(d2_00);
                converter.setD2_01(d2_01);
                converter.setD2_02(d2_02);
                converter.setD2_03(d2_03);
                converter.setD2_04(d2_04);
                converter.setD2_05(d2_05);
                converter.setD2_06(d2_06);
                converter.setD2_07(d2_07);
                converter.setD2_08(d2_08);
                converter.setD2_09(d2_09);
                converter.setD2_10(d2_10);
                converter.setD2_11(d2_11);

                repo.save(converter);
                for (int i = 0; i < 30; i++) {
                    System.out.println(row.getCell(i) + " ");
                }


            }

        }


        return null;
    }
}
