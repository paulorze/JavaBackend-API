package ar.com.desafio5.restapiconnector.connectors.covidtracker;

import java.util.List;

import ar.com.desafio5.restapiconnector.connectors.RestClientConnector;
import ar.com.desafio5.restapiconnector.connectors.covidtracker.dto.DailyCovidTrackerJson;
import jakarta.ws.rs.core.GenericType;

public class APICovidConnector extends RestClientConnector<DailyCovidTrackerJson> {

	public APICovidConnector(String url) {
		super(url, DailyCovidTrackerJson.class, new GenericType<List<DailyCovidTrackerJson>>() {});
	}

}
