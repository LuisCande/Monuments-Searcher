package aiss.resource.test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.flickr.FlickrSearch;
import aiss.resource.FlickrResource;

public class FlickrTest {

	@Test
	public void getPhotosTest() throws UnsupportedEncodingException {
		String city = "Sevilla";
		FlickrResource flickr = new FlickrResource();
		FlickrSearch flickrResults = flickr.getFlickrPhotos(city);
		
		assertNotNull("The search returned null", flickrResults);
		assertNotNull("The search returned null", flickrResults.getPhotos().getPhoto());
		assertFalse("The number of photos of " + city + " is zero", flickrResults.getPhotos().getPhoto().size()==0);
		
		System.out.println("The search for " + city + "'s albums returned " + flickrResults.getPhotos().getPhoto().size() + " photos.");
		
	
	}

}
