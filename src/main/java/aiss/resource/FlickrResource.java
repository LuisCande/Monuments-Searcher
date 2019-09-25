package aiss.resource;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.flickr.FlickrSearch;


public class FlickrResource {

	private static final String FLICKR_API_KEY = "4acd2b0e82f16886732947e5b8237acf";
	private static final Logger log = Logger.getLogger(FlickrResource.class.getName());

	
	public FlickrSearch getFlickrPhotos(String query) throws UnsupportedEncodingException{
		
		String encoded = URLEncoder.encode(query, "UTF-8");
		// TODO: Perform search in Flickr
		ClientResource cr = new ClientResource("https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key="+FLICKR_API_KEY+"&tags=arquitectura&sort=relevance&text="+encoded+"&format=json&nojsoncallback=1");
		FlickrSearch p = cr.get(FlickrSearch.class);
		log.log(Level.FINE, "Busqueda de "+query+" realizada correctamente.");
		return p;
	}
	
}

