package ar.com.desafio5.console;

import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;
import ar.com.desafio5.service.ServiceLocator;
import ar.com.desafio5.service.covidtracker.DailyCovidTrackerService;

public class DCTApp {
	public static void main(String[] args) {
		DailyCovidTrackerService dctservice = (DailyCovidTrackerService) ServiceLocator.getService(DailyCovidTrackerService.class);
		System.out.println(dctservice.findAll());
		Long dctIdToFind = (long) 20210306;
		System.out.println(dctservice.findById(dctIdToFind));
		Long id = (long) 20230407;
		Long date = (long) 20230407;
		Long states = (long) 56;
		Long positive = (long) 28654639;
		Long negative = (long) 74307155;
		Long pending = (long) 12213;
		Long hospitalizedCurrently = (long) 42541;
		Long hospitalizedCumulative = (long) 775132;
		Long inIcuCurrently = (long) 8634;
		Long inIcuCumulative = (long) 45373;
		Long onVentilatorCurrently = (long) 2889;
		Long onVentilatorCumulative = (long) 4275;
		String dateChecked = "2023-04-05T24:00:00Z";
		Long death = (long) 512629;
		Long hospitalized = (long) 775132;
		Long totalTestResults = (long) 361224072;
		String lastModified = "2023-04-05T24:00:00Z";
		Long deathIncrease = (long) 2221;
		Long hospitalizedIncrease = (long) 2781;
		Long negativeIncrease = (long) 271917;
		Long positiveIncrease = (long) 68787;
		Long totalTestResultsIncrease = (long) 1744417;
		DailyCovidTracker dctnew  = new DailyCovidTracker (id, date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently, inIcuCumulative, onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized, totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease, totalTestResultsIncrease);
		dctservice.save(dctnew);
		System.out.println(dctservice.findById(id));
		dctnew.setStates((long) 9999999);
		dctservice.update(dctnew);
		System.out.println(dctservice.findById(id));
		dctservice.deleteById(id);
	}
}
