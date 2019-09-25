package aiss.resource;


import java.util.logging.Logger;

import org.restlet.data.Form;
import org.restlet.data.MediaType;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;




public class FoursquarePostResource {


	private static final Logger log = Logger.getLogger(FoursquarePostResource.class.getName());
	private String uri = "https://api.foursquare.com/v2/venues/add";
	private String access_token;
	
	public FoursquarePostResource(String access_token) {
		this.access_token = access_token;
	}
	
	public Boolean addLugar(String venue, String latitud,String longitud) {
		
		ClientResource p = null;
		String normNombre=venue.replace(' ','+');
		String normLat=latitud.replace(' ','+');
		String normLon=longitud.replace(' ','+');

		Form form = new Form();

        form.add("name", normNombre);
        form.add("ll", normLat+","+normLon); 
        form.add("oauth_token", access_token);
		
		try {
		String postUri = uri + "?v=20171214&access_token="+access_token;
		log.info(postUri);
		p = new ClientResource(postUri);
		p.setEntityBuffering(true);
		p.post(form, MediaType.APPLICATION_JSON);
	
		
		} catch (ResourceException e) {
			System.err.println("Error when posting the venue: " + p.getResponse().getStatus());
		} catch (NullPointerException e) {
			System.err.println("Error when posting the venue: " + p.getResponse().getStatus());
		}
		return true;
	}

}
