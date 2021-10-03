package com.objectrepository.BMCDE;

import org.openqa.selenium.By;

public class LoginPage {
	public static By signinbutton = By.id("preSignIn");
	public static By txtemail = By.id("email");
	public static By txtpasswword = By.id("password");
	public static By showeye = By.xpath("//img[@class=\"password-eye-click closed\"]");
	public static By hideeye = By.xpath("//img[@class=\"password-eye-click open\"]");
	public static By submitbutton = By.id("btnLogin");
	public static By profilebutton = By.id("profileBtn");
	public static By signoutbutton = By.xpath("//a[@href=\"/accounts/logout\"]");

}
