package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.wunderground.Example;
import aiss.model.flickr.FlickrSearch;
import aiss.resource.FlickrResource;
import aiss.resource.FoursquareResource;
import aiss.resource.WundergroundResource;

public class SearchController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(SearchController.class.getName());
	 
    
    public SearchController() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String query = request.getParameter("searchQuery");
		RequestDispatcher rd = null;
		
		//Flickr
		
		log.log(Level.FINE, "Searching for photos of " + query);
		FlickrResource flickr = new FlickrResource();
		FlickrSearch flickrResults = flickr.getFlickrPhotos(query);
		
		if (flickrResults!=null){
			rd = request.getRequestDispatcher("/resultView.jsp");
			request.setAttribute("photos", flickrResults.getPhotos().getPhoto());
		} else {
			log.log(Level.SEVERE, "Flickr object: " + flickrResults);
			rd = request.getRequestDispatcher("/errorView.jsp");
		}
		
	
		
		//Foursquare
	
		log.log(Level.FINE, "Searching for venues of " + query);
		FoursquareResource foursquare = new FoursquareResource();
		aiss.model.foursquare.Example foursquareResults = foursquare.getFoursquareVenues(query);
		
		if (foursquareResults!=null){
			request.setAttribute("venues", foursquareResults.getResponse().getVenues());
			rd = request.getRequestDispatcher("/resultView.jsp");
			System.out.println(foursquareResults.getResponse().getVenues());
		} else {
			log.log(Level.SEVERE, "Foursquare object: " + foursquareResults);
			rd = request.getRequestDispatcher("/errorView.jsp");
		}
		
		
		//Wunderground
		
		log.log(Level.FINE, "Searching for forecast of " + query);
		WundergroundResource wunderground = new WundergroundResource();
		Example wundergroundResults = wunderground.getWundergroundWeather(query);
		
		if (wundergroundResults!=null && wundergroundResults.getCurrentObservation()!=null){
			request.setAttribute("precipitations", wundergroundResults.getCurrentObservation().getPrecipTodayString());
			request.setAttribute("sky",wundergroundResults.getCurrentObservation().getWeather());
			request.setAttribute("windspeed",wundergroundResults.getCurrentObservation().getWindKph());
			request.setAttribute("temperature",wundergroundResults.getCurrentObservation().getTemperatureString());
			request.setAttribute("info",wundergroundResults.getCurrentObservation().getForecastUrl());
			rd = request.getRequestDispatcher("/resultView.jsp");
			System.out.println(wundergroundResults.getCurrentObservation().getPrecipTodayString());
			System.out.println(wundergroundResults.getCurrentObservation().getWeather());
			System.out.println(wundergroundResults.getCurrentObservation().getWindKph());
			System.out.println(wundergroundResults.getCurrentObservation().getTemperatureString());
			System.out.println(wundergroundResults.getCurrentObservation().getForecastUrl());
		} else {
			log.log(Level.SEVERE, "Wunderground object: " + wundergroundResults);
			rd = request.getRequestDispatcher("/errorView.jsp");
		}
		
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
