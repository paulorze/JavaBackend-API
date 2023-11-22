package ar.com.desafio5.service.covidtracker;

import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;
import ar.com.desafio5.repository.covidtracker.DailyCovidTrackerRepositoryImpl;
import ar.com.desafio5.service.EntidadBaseService;

public class DailyCovidTrackerServiceImpl extends EntidadBaseService<DailyCovidTracker> implements DailyCovidTrackerService {

	public DailyCovidTrackerServiceImpl() {
		super(new DailyCovidTrackerRepositoryImpl());
	}

}
