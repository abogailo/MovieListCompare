
package com.abogailo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int count = 0;
		final Document doc = Jsoup.connect("http://www.imdb.com/chart/top").get();

		for (Element row : doc.select("tbody.lister-list tr")) {

			final String title = row.select(".titleColumn a").text();
			final String year = row.select(".secondaryInfo").text();
			final String rating = row.select(".imdbRating").text();
			count++;
			int rank = count;
			System.out.println(rank + " " + year + " " + title + " " + rating);

			
		}
	}
}