package com.gmail;

import org.openqa.selenium.WebDriver;

public class GmailValidate {

	private WebDriver d;
	private String appURL="http://gmail.com";
	
	public void gmailVerify()
	{
		d.get(appURL);
		d.manage().window().maximize();
		System.out.println("title of the page : "+d.getTitle());
	}
	public static void main(String args[])
	{
		GmailValidate gv1=new GmailValidate();
		gv1.d=DriversObject.getDriverObject("firefox");
		gv1.gmailVerify();
		
	}
}
