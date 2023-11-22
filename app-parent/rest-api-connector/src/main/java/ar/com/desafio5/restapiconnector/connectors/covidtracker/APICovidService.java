package ar.com.desafio5.restapiconnector.connectors.covidtracker;

import ar.com.desafio5.restapiconnector.connectors.covidtracker.dto.DailyCovidTrackerJson;

public interface APICovidService {
	public DailyCovidTrackerJson findById(Long date);
}
