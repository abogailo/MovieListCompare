package com.abogailo.controller;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.abogailo.dao.ScraperDAO;
import com.abogailo.entity.Scraper;

public class RunMybatis {
	public static void main(String[] args) throws IOException {
		  /*ScraperDAO scraperDAO = new ScraperDAO();	
		 //insert	
		  Scraper scraper = new Scraper(null, null, null, null, null);
		  scraper.setId(15);
		  scraper.setTitle("Fuad goes to the Store");
		  scraper.setReleaseYear(1978);
		  scraper.setRating(8.0);
		  scraperDAO.save(scraper);
		  System.out.println("---Data saved---");
		  
		  //update
		  scraper = new Scraper(1, "Fuad", 2, 2, 2.0);
		  scraper.setId(1);
		  scraper.setTitle("Fuad Didn't Make it to the Store");
		  scraper.setReleaseYear(1979);
		  scraper.setRating(5.0);
		  scraperDAO.update(scraper);
		  System.out.println("---Data updated---");
		  
		  //select
		  scraper = scraperDAO.getData(13);
		  System.out.println("Movie Id:"+ scraper.getId() + ", Movie Title:"+scraper.getTitle() +", Movie Released: "+scraper.getReleaseYear() + ", Movie Rating: " + scraper.getRating());
		  //scraper = scraperDAO.getAllData();
		  //delete
		  scraperDAO.delete(1008);
		  System.out.println("---Data deleted---");*/
		ScraperDAO scraperDAO = new ScraperDAO();
		Scraper scraper = new Scraper(1, "Fuad", 2, 2, 2.0);
		scraperDAO.save(scraper);
	} 
}