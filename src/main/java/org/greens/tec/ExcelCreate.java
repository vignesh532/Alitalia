package org.greens.tec;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelCreate {
	
	public static void main(String[] args) throws IOException {
		File f= new File("E:\\Selenium Project\\WorkSpace\\LoginFb\\Data\\Vignesh.xlsx");
		
		Workbook w= new XSSFWorkbook();
		Sheet s= w.createSheet("Data");
		Row r= s.createRow(1);
		Cell c = r.createCell(1);
		c.setCellValue("Prabhakaran");
		
		FileOutputStream o=new FileOutputStream(f);
		w.write(o);
		System.out.println("Done........");
		System.out.println("hhai");
		
	
		
		
		 
		
		
		
		
		
		
	}

}
