package org.greens.tec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
		public static void main(String[] args) {
		
		File f=new File("E:\\Selenium Project\\WorkSpace\\LoginFb\\Data\\Demodata.xlsx") ;
		
		try {
			FileInputStream stre =new FileInputStream(f);
			
			Workbook w=new XSSFWorkbook(stre);
			
			Sheet s= w.getSheet("Sheet1");			 
						
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				
				Row r = s.getRow(i);
				
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					
					Cell c= r.getCell(j);
					
					int ce = c.getCellType();
					
					if(ce==1) {
						String txt = c.getStringCellValue();
						System.out.println(txt);
					}
					if(ce==0) {
						
						if(DateUtil .isCellDateFormatted(c)) {
							
							String pho = new SimpleDateFormat("dd-MMM-yy").format(c.getDateCellValue());
							System.out.println(pho);
							
						}else {
							String nam = String.valueOf((long) c.getNumericCellValue());
							System.out.println(nam);
						}
					double num = c.getNumericCellValue();	
					
					long l= (long)num;
					String name= String.valueOf(l);
					
					System.out.println(name);
				}
				
				
				
				
			}		
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
