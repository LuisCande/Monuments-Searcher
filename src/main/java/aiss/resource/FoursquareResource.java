package aiss.resource;

import java.io.UnsupportedEncodingException;
import org.restlet.resource.ClientResource;

import aiss.model.foursquare.Example;

public class FoursquareResource {
	
	private static final String FOURSQUARE_TOKEN = "QJSIQLV5WBROJT1ISQZKTUYTMJCZQ3T20GAELDUDIZL5RHP3";
	
	public Example getFoursquareVenues(String query) throws UnsupportedEncodingException{
		
		String uri = "https://api.foursquare.com/v2/venues/search?near="+ query + "&oauth_token=" + FOURSQUARE_TOKEN + "&v=20170426";
		ClientResource cr = new ClientResource(uri);
		Example r = cr.get(Example.class);
		return r;
	}
}
