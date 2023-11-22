package ar.com.desafio5.restapiconnector.connectors.covidtracker;

import java.util.List;

import ar.com.desafio5.restapiconnector.connectors.covidtracker.dto.DailyCovidTrackerJson;

public class APICovidServiceImpl implements APICovidService {
	
	private APICovidConnector connector;
	
	public APICovidServiceImpl () {
		connector = new APICovidConnector("https://api.covidtracking.com/v1/us/daily.json");
	}
	
	@Override
	public DailyCovidTrackerJson findById(Long date) {
		List<DailyCovidTrackerJson> jsonList = connector.find(null);
		return jsonList.stream()
	            .filter(json -> date.equals((long) json.date))
	            .findFirst()
	            .orElse(null);
	}

}
