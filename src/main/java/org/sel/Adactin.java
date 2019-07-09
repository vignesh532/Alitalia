package org.sel;

import org.greens.tec.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver= getDriver();
	
	enterUrl("http://www.adactin.com/HotelApp/index.php");
	HotelLogin page = new HotelLogin();
	enterText(page.getTextUserName(), "vignesh532");
	enterText(page.getTextpass(), "Vignesh@1234");
	buttonClick(page.getBtnlogin());
	
	SearchHotel p = new SearchHotel();
	enterText(p.getDropLocation(),"Melbourne");
	enterText(p.getDropRoomType(), "Deluxe");
	enterText(p.getDropROomTypes(),"3 - Three");
	enterText(p.getDropDatePickup(), "30/06/2019");
	enterText(p.getDropDatePickOut(), "01/07/2019");
	enterText(p.getDropAdultRoom(), "4 - Four");
	enterText(p.getDropChildRoom(), "2 - Two");
	buttonClick(p.getClikSubmit());
	buttonClick(p.getSeleRadioButton());
	buttonClick(p.getSelContinue());
	
	BookHotel bo = new BookHotel();
	
	enterText(bo.getTextFirstName(),"Vignesh");
	enterText(bo.getTextLastName(), "Babu");
	enterText(bo.getTextAddress(), "38 E Rajakannu St");
	enterText(bo.getTextccnum(), "1234567890123456");
	enterText(bo.getDropCcType(), "VISA");
	enterText(bo.getDropExpMonth(), "June");
	enterText(bo.getDropExpYear(), "2022");
	enterText(bo.getTextCvvNum(), "354");
	buttonClick(bo.getClikButton());
	
	Thread.sleep(9000);
	
	gettingText(bo.getGetOrderNo());
	
	
	
	
	
	
	
	
	
	
	
	
	

}

	private static void gettingText(String string) {
		// TODO Auto-generated method stub
		
	}

}