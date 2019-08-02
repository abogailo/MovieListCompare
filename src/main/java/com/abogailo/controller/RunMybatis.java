package com.abogailo.controller;


import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.abogailo.dao.*;
import com.abogailo.entity.*;

public class RunMybatis {
	public static void main(String[] args) throws IOException {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		LoginDAO loginDAO = new LoginDAO();
		UserDAO userDAO = new UserDAO();
		ScraperDAO scraperDAO = new ScraperDAO();
		UserListDAO userListDAO = new UserListDAO();
		
	//Scraper scraper = new Scraper(1, "Fuad", 2, 2, 2.0);
		//scraperDAO.save(scraper);
		
		
    	User user = new User(1,"hi","hi","hi","hi",date,"k");
    	userDAO.save(user);
    	
		//Login login = new Login(14,"hmmmm","hmmm");
		//loginDAO.save(login);
		
		//UserList userlist = new UserList(1,1,1,1,1);
		//userListDAO.save(userlist);
	} 
}