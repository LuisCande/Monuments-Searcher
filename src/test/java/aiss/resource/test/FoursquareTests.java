package aiss.resource.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.foursquare.Example;
import aiss.resource.FoursquareResource;

public class FoursquareTests {
	
	@Test
	public void getFoursquareTest() throws UnsupportedEncodingException {
		
		String city = "Sevilla";
		FoursquareResource foursquare = new FoursquareResource();
		Example foursquareResults = foursquare.getFoursquareVenues(city);
		
		assertNotNull("The search returned null", foursquareResults);
		assertNotNull("The search returned null", foursquareResults.getResponse().getVenues());
		assertFalse("The number of venues of " + city + " is zero", foursquareResults.getResponse().getVenues().size()==0);
		
		System.out.println("The search for " + city + "'s venues returned " + foursquareResults.getResponse().getVenues().size() + " venues.");
		
	}


}
