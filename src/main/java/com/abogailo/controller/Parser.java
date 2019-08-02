
package com.abogailo.controller;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.abogailo.dao.*;
import com.abogailo.entity.*;


public class Parser {

	/**Scrapes IMDB for Top 250 List and then stores it in MySQL database.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int count = 0;
		
		final Document doc = Jsoup.connect("http://www.imdb.com/chart/top").get();

		for (Element row : doc.select("tbody.lister-list tr")) {
			count++;
			
			final String title = row.select(".titleColumn a").text();
			final String yearStr = row.select(".secondaryInfo").text();
			final String ratingStr = row.select(".imdbRating").text();
			final int rank = count;
			final int id = rank + 100;
			
			String replace = yearStr.replaceAll("[()]", "");
			Integer year = Integer.valueOf(replace);	
			Double rating = Double.valueOf(ratingStr);	
			
			//ScraperDAO scraper = new ScraperDAO(); //dont do this again
			Scraper movie = new Scraper(id, title, rank, year, rating);
			
			//scraper.save(movie);
			
			System.out.println("Movie ID: " + movie.getId()  + "  Movie Title: " + movie.getTitle() + "  Movie Rank: " + movie.getRank() + "  Movie Release Year: " + movie.getReleaseYear() + "  Movie Rating: " + movie.getRating());
			//System.out.println();
		}
	}
}