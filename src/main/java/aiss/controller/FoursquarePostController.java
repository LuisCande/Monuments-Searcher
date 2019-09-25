package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aiss.resource.FoursquarePostResource;

public class FoursquarePostController extends HttpServlet {

	private static final long serialVersionUID = -6818025976353856770L;
	private static final Logger log = Logger.getLogger(FoursquarePostController.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String accessToken = (String) req.getSession().getAttribute("Foursquare-token");
	//	accessToken = "QJSIQLV5WBROJT1ISQZKTUYTMJCZQ3T20GAELDUDIZL5RHP3";
		if (accessToken != null && !"".equals(accessToken)) {

			FoursquarePostResource foursquareResource = new FoursquarePostResource(accessToken);
			
			foursquareResource.addLugar(req.getParameter("nameVenue"), req.getParameter("latitude"),
					req.getParameter("longitude"));
			
			req.getRequestDispatcher("/postSuccessView.jsp").forward(req, resp);
			
		} else {
			log.info("Trying to access to Foursquare without an access token, redirecting to OAuth servlet");
			req.getRequestDispatcher("/AuthController/Foursquare").forward(req, resp);
		}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
