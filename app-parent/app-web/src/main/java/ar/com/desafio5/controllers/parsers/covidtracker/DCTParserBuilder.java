package ar.com.desafio5.controllers.parsers.covidtracker;

public class DCTParserBuilder {
	public static DCTParser buildParser (String fileName) {
		String ext = getExt(fileName);
		ParserEnum parseEnum = ParserEnum.valueOf(ext);
		DCTParser parse = parseEnum.parser;
		return parse;
	}
	
	public static String getExt (String fileName) {
		String [] aux = fileName.split("\\.");
		return aux[aux.length - 1].toUpperCase();
	}
	
	private enum ParserEnum {
		CSV(new DCTCSVFileParser()),
		XLS(new DCTXLSFileParser()),
		XLSX(new DCTXLSFileParser());
		
		private DCTParser parser;
		private ParserEnum(DCTParser parser) {
			this.parser = parser;
		}
	}
}
