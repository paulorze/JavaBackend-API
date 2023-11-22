package ar.com.desafio5.repository.covidtracker;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;
import ar.com.desafio5.repository.BaseCrud;

public class DailyCovidTrackerRepositoryImpl extends BaseCrud<DailyCovidTracker> implements DailyCovidTrackerRepository {
	
	public DailyCovidTrackerRepositoryImpl() {
		super(DailyCovidTracker.class,"DAILYCOVIDTRACKER");
	}
	
	protected String getSaveSQL() {
		return "(id, data) values (?,?)";
	}
	
	protected void saveEntity (DailyCovidTracker entity, PreparedStatement pst) throws SQLException {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String jsonString = objectMapper.writeValueAsString(entity);
			pst.setLong(1, entity.getId());
			pst.setString(2,  jsonString);
		} catch (JsonProcessingException e) {
			System.err.println(e);
		}
	}
	
	@Override
	protected String getUpdateSQL() {
		return "data = ?";
	}
	
	@Override
	protected void setUpdateSQL(DailyCovidTracker entity, PreparedStatement pst) throws SQLException {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String jsonString = objectMapper.writeValueAsString(entity);
			pst.setString(1, jsonString);
		} catch (JsonProcessingException e) {
			System.err.println(e);
		}
	}
	
	@Override
	protected DailyCovidTracker fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String jsonString = res.getString(2);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = null;;
		try {
			jsonNode = objectMapper.readTree(jsonString);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Long date = jsonNode.get("date").asLong();
		Long states = jsonNode.get("states").asLong();
		Long positive = jsonNode.get("positive").asLong();
		Long negative = jsonNode.get("negative").asLong();
		Long pending = jsonNode.get("pending").asLong() ;
		Long hospitalizedCurrently = jsonNode.get("hospitalizedCurrently").asLong();
		Long hospitalizedCumulative = jsonNode.get("hospitalizedCumulative").asLong();
		Long inIcuCurrently = jsonNode.get("inIcuCurrently").asLong();
		Long inIcuCumulative = jsonNode.get("inIcuCumulative").asLong();
		Long onVentilatorCurrently = jsonNode.get("onVentilatorCurrently").asLong();
		Long onVentilatorCumulative = jsonNode.get("onVentilatorCumulative").asLong();
		String dateChecked = jsonNode.get("dateChecked").asText();
		Long death = jsonNode.get("death").asLong();
		Long hospitalized = jsonNode.get("hospitalized").asLong();
		Long totalTestResults = jsonNode.get("totalTestResults").asLong();
		String lastModified = jsonNode.get("lastModified").asText();
		Long deathIncrease = jsonNode.get("deathIncrease").asLong();
		Long hospitalizedIncrease = jsonNode.get("hospitalizedIncrease").asLong();
		Long negativeIncrease = jsonNode.get("negativeIncrease").asLong();
		Long positiveIncrease = jsonNode.get("positiveIncrease").asLong();
		Long totalTestResultIncrease = jsonNode.get("totalTestResultsIncrease").asLong();
		return new DailyCovidTracker(id, date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently, inIcuCumulative,onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized, totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease, totalTestResultIncrease);
	}
}
