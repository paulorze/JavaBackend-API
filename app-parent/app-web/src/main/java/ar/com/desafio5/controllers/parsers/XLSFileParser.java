package ar.com.desafio5.controllers.parsers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class XLSFileParser <T> implements IParser<T> {
	
	@Override
	public Collection<T> parse(InputStream inputStream) {
		var registros = new ArrayList<T>();
		try (XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
			XSSFSheet spreadsheet = workbook.getSheetAt(0); 
			for (Row cells : spreadsheet) {
				XSSFRow row = (XSSFRow) cells;
				registros.add(parseData(row));
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return registros;
	}

	protected abstract T parseData (XSSFRow row);
	
}
