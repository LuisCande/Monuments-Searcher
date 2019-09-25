package aiss.resource;

import java.io.UnsupportedEncodingException;
import org.restlet.resource.ClientResource;

import aiss.model.wunderground.Example;;


public class WundergroundResource {
		
	private static final String WUNDERGROUND_KEY = "815c16665047f22a";
	
	public Example getWundergroundWeather(String query) throws UnsupportedEncodingException{
		
		ClientResource cr = new ClientResource("http://api.wunderground.com/api/"+WUNDERGROUND_KEY+"/geolookup/conditions/forecast/q/Spain/"+ query +".json");
		Example ps = cr.get(Example.class);
		return ps;
	}
}
