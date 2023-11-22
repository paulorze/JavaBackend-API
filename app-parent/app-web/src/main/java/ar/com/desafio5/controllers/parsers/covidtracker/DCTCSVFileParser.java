package ar.com.desafio5.controllers.parsers.covidtracker;

import ar.com.desafio5.controllers.parsers.CSVFileParser;
import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;

public class DCTCSVFileParser extends CSVFileParser<DailyCovidTracker> implements DCTParser{

	@Override
	protected DailyCovidTracker parseData(String data) {
		String [] values = data.split(";");
		Long date = Long.parseLong(values[0]);
		Long states = Long.parseLong(values[1]);
		Long positive = Long.parseLong(values[2]);
		Long negative = Long.parseLong(values[3]);
		Long pending = Long.parseLong(values[4]);
		Long hospitalizedCurrently = Long.parseLong(values[5]);
		Long hospitalizedCumulative = Long.parseLong(values[6]);
		Long inIcuCurrently = Long.parseLong(values[7]);
		Long inIcuCumulative = Long.parseLong(values[8]);
		Long onVentilatorCurrently = Long.parseLong(values[9]);
		Long onVentilatorCumulative = Long.parseLong(values[10]);
		String dateChecked = values[11];
		Long death = Long.parseLong(values[12]);
		Long hospitalized = Long.parseLong(values[13]);
		Long totalTestResults = Long.parseLong(values[14]);
		String lastModified = values[15];
		Long deathIncrease = Long.parseLong(values[16]);
		Long hospitalizedIncrease = Long.parseLong(values[17]);
		Long negativeIncrease = Long.parseLong(values[18]);
		Long positiveIncrease = Long.parseLong(values[19]);
		Long totalTestResultIncrease = Long.parseLong(values[20]);
		return new DailyCovidTracker (date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently, inIcuCumulative, onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized, totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease, totalTestResultIncrease);
	}

}
