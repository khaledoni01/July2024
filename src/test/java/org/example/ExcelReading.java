package org.example;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReading {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/test/resources/testing.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Sheet2");

            for(int r=0; r<=sheet.getLastRowNum(); r++) {

                for(int c=0; c<sheet.getRow(r).getLastCellNum(); c++) {

                    System.out.print(sheet.getRow(r).getCell(c) + " ");
                }
                System.out.println();
            }

            wb.close();
            fis.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Workbook is not readable");
            throw new RuntimeException(e);
        }


    }
}
