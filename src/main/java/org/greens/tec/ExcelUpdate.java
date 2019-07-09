package org.greens.tec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	
	public static void main(String[] args) {
		
		File f=new File("E:\\Selenium Project\\WorkSpace\\LoginFb\\Data\\Demodata.xlsx") ;
		
	    try {
			FileInputStream st =new FileInputStream(f);
			Workbook w=new XSSFWorkbook(st);
			Sheet s1= w.getSheet("Sheet1");
			Row r= s1.getRow(3);
			Cell c= r.getCell(1);
			
			String cell = c.getStringCellValue();
			
			if(cell.equals("Vignesh")) {
				
				c.setCellValue("Devi");
				
			}
		
			FileOutputStream f1= new FileOutputStream(f);
			w.write(f1);
			System.out.println("Done........");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
