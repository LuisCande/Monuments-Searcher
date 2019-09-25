package aiss.resource.test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.wunderground.Example;
import aiss.resource.WundergroundResource;


public class WundergroundTest {

	@Test
	public void getWundergroundTest() throws UnsupportedEncodingException {
		String city = "Sevilla";
		WundergroundResource weather = new WundergroundResource();
		Example weatherResults = weather.getWundergroundWeather(city);
		
		System.out.println(weatherResults);
	
		assertNotNull("The search returned null", weatherResults);
		assertNotNull("The search returned null", weatherResults);
		
		
		System.out.println("The search for " + city + "'s precipitations returned " + weatherResults.getCurrentObservation().getPrecipTodayString()+ ".");
		System.out.println("The search for " + city + "'s sky returned " + weatherResults.getCurrentObservation().getWeather()+ ".");
		System.out.println("The search for " + city + "'s wind speed returned " + weatherResults.getCurrentObservation().getWindKph()+ " kms/h.");
		System.out.println("The search for " + city + "'s temperature returned " + weatherResults.getCurrentObservation().getTemperatureString()+ ".");
		System.out.println("The search for " + city + "'s info returned " + weatherResults.getCurrentObservation().getForecastUrl()+ ".");
	}

}

