package ar.com.desafio5.controllers.parsers;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public abstract class CSVFileParser <T> implements IParser<T> {
	
	@Override
	public Collection<T> parse(InputStream inputStream) {
		var registros = new ArrayList<T>();
		try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line = bufferedReader.readLine();
			if (line == null || line.length() == 0) {
				throw new IllegalArgumentException();
			}
			while((line = bufferedReader.readLine()) != null) {
			registros.add(parseData(line));
			}	
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return registros;
	}
	
	protected abstract T parseData(String data);
}
