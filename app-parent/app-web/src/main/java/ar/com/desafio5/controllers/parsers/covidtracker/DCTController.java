package ar.com.desafio5.controllers.parsers.covidtracker;

import java.io.IOException;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.desafio5.domain.ErrorResponse;
import ar.com.desafio5.domain.covidtracker.DailyCovidTracker;
import ar.com.desafio5.restapiconnector.connectors.covidtracker.APICovidServiceImpl;
import ar.com.desafio5.restapiconnector.connectors.covidtracker.dto.DailyCovidTrackerJson;
import ar.com.desafio5.service.ServiceLocator;
import ar.com.desafio5.service.covidtracker.DailyCovidTrackerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/covid")
public class DCTController extends HttpServlet {
	
	private static final long serialVersionUID = 8126509770727316553L;
	private DailyCovidTrackerService service = (DailyCovidTrackerService) ServiceLocator.getService(DailyCovidTrackerService.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
			Collection<DailyCovidTracker> objects = service.findAll();
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(objects);
			resp.getWriter().print(json);
		} else {			
			Long id = Long.parseLong(req.getParameter("id"));
			DailyCovidTracker object = service.findById(id);
			if (object == null) {
				APICovidServiceImpl apiConnector = new APICovidServiceImpl();
				try {
					DailyCovidTrackerJson objectJson = apiConnector.findById(id);
					object = new DailyCovidTracker((long) objectJson.date, (long) objectJson.date, (long) objectJson.states, (long) objectJson.positive, (long) objectJson.negative, (long) objectJson.pending, (long) objectJson.hospitalizedCurrently, (long) objectJson.hospitalizedCumulative, (long) objectJson.inIcuCurrently, (long) objectJson.inIcuCumulative, (long) objectJson.onVentilatorCurrently, (long) objectJson.onVentilatorCumulative, objectJson.dateChecked, (long) objectJson.death, (long) objectJson.hospitalized, (long) objectJson.totalTestResults, objectJson.lastModified, (long) objectJson.deathIncrease, (long) objectJson.hospitalizedIncrease, (long) objectJson.negativeIncrease, (long) objectJson.positiveIncrease, (long) objectJson.totalTestResultsIncrease);
					service.save(object);
				} catch (RuntimeException e) {
				    ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_NOT_FOUND, "No data found for ID " + id);
				    ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				} catch (Exception e) {
				    ErrorResponse error = new ErrorResponse(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "There was an unexpected error while trying to save the object.");
				    ObjectMapper mapper = new ObjectMapper();
				    resp.getWriter().print(mapper.writeValueAsString(error));
				    return;
				}
			}
			ObjectMapper mapper = new ObjectMapper();
			String json = mapper.writeValueAsString(object);
			resp.getWriter().print(json);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	DCTRequestVO input = new DCTRequestVO(req);
    	DailyCovidTracker newEntity = new DailyCovidTracker(input.getDate(), input.getStates(), input.getPositive(), input.getNegative(), input.getPending(), input.getHospitalizedCurrently(), input.getHospitalizedCumulative(), input.getInIcuCurrently(), input.getInIcuCumulative(), input.getOnVentilatorCurrently(), input.getOnVentilatorCumulative(), input.getDateChecked(), input.getDeath(), input.getHospitalized(), input.getTotalTestResults(), input.getLastModified(), input.getDeathIncrease(), input.getHospitalizedIncrease(), input.getNegativeIncrease(), input.getPositiveIncrease(), input.getTotalTestResultIncrease());
    	service.save(newEntity);
    	resp.getWriter().print("Se ha almacenado correctamente el articulo con el ID: " + newEntity.getId());
	}
}
