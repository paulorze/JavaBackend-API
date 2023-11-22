package ar.com.desafio5.controllers.parsers.covidtracker;

import org.apache.poi.xssf.usermodel.XSSFRow;

import ar.com.desafio5.controllers.parsers.XLSFileParser;
import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;

public class DCTXLSFileParser extends XLSFileParser<DailyCovidTracker> implements DCTParser{

	@Override
	protected DailyCovidTracker parseData(XSSFRow row) {
		Long date = Math.round(row.getCell(0).getNumericCellValue());
		Long states = Math.round(row.getCell(1).getNumericCellValue());
		Long positive = Math.round(row.getCell(2).getNumericCellValue());
		Long negative = Math.round(row.getCell(3).getNumericCellValue());
		Long pending = Math.round(row.getCell(4).getNumericCellValue());
		Long hospitalizedCurrently = Math.round(row.getCell(5).getNumericCellValue());
		Long hospitalizedCumulative = Math.round(row.getCell(6).getNumericCellValue());
		Long inIcuCurrently = Math.round(row.getCell(7).getNumericCellValue());
		Long inIcuCumulative = Math.round(row.getCell(8).getNumericCellValue());
		Long onVentilatorCurrently = Math.round(row.getCell(9).getNumericCellValue());
		Long onVentilatorCumulative = Math.round(row.getCell(10).getNumericCellValue());
		String dateChecked = row.getCell(11).getStringCellValue(); //LA FECHA SE DEBERA PASAR AAAA-MM-DD
		Long death = Math.round(row.getCell(12).getNumericCellValue());
		Long hospitalized = Math.round(row.getCell(13).getNumericCellValue());
		Long totalTestResults = Math.round(row.getCell(14).getNumericCellValue());
		String lastModified = row.getCell(15).getStringCellValue(); //LA FECHA SE DEBERA PASAR AAAA-MM-DD
		Long deathIncrease = Math.round(row.getCell(16).getNumericCellValue());
		Long hospitalizedIncrease = Math.round(row.getCell(17).getNumericCellValue());
		Long negativeIncrease = Math.round(row.getCell(18).getNumericCellValue());
		Long positiveIncrease = Math.round(row.getCell(19).getNumericCellValue());
		Long totalTestResultIncrease = Math.round(row.getCell(20).getNumericCellValue());
		return new DailyCovidTracker (date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently, inIcuCumulative, onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized, totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease, totalTestResultIncrease);
	}
}
