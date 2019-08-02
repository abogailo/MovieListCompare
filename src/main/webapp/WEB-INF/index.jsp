
<%@ page import="com.abogailo.dao.*"%>
<%@ page import="com.abogailo.*"%>
<html>
<body>
<h2>A Random Movie!</h2>

<body>
<%
	int movie_id = 1009;

	ScraperDAO scraperDAO = new ScraperDAO();	


	scraper = scraperDAO.getData(movie_id);

	out.println("Movie Id: "+scraper.getId()+", Movie Title: "+scraper.getTitle()+", Movie Released: "+scraper.getReleaseYear()+ ", Movie Rated: " + scraper.getRating()); 
%>
</body>
</body>
</html>
