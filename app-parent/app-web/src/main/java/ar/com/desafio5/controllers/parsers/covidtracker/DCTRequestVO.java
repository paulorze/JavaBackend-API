package ar.com.desafio5.controllers.parsers.covidtracker;

import jakarta.servlet.http.HttpServletRequest;

public class DCTRequestVO {
	private Long date;
	private Long states;
	private Long positive;
	private Long negative;
	private Long pending ;
	private Long hospitalizedCurrently;
	private Long hospitalizedCumulative;
	private Long inIcuCurrently;
	private Long inIcuCumulative;
	private Long onVentilatorCurrently;
	private Long onVentilatorCumulative;
	private String dateChecked;
	private Long death;
	private Long hospitalized;
	private Long totalTestResults;
	private String lastModified;
	private Long deathIncrease;
	private Long hospitalizedIncrease;
	private Long negativeIncrease;
	private Long positiveIncrease;
	private Long totalTestResultIncrease;
	
	public DCTRequestVO (HttpServletRequest req) {
		if (req.getParameter("date") == null) {
			throw new IllegalArgumentException ("Date not valid.");
		}
		this.date = Long.parseLong(req.getParameter("date"));
		
		if (req.getParameter("states") == null) {
			throw new IllegalArgumentException ("States not valid.");
		}
		this.states = Long.parseLong(req.getParameter("states"));
		
		if (req.getParameter("positive") == null) {
			throw new IllegalArgumentException ("Positive not valid.");
		}
		this.positive = Long.parseLong(req.getParameter("positive"));
		
		if (req.getParameter("negative") == null) {
			throw new IllegalArgumentException ("Negative not valid.");
		}
		this.negative = Long.parseLong(req.getParameter("negative"));
		
		if (req.getParameter("pending") == null) {
			throw new IllegalArgumentException ("Pending not valid.");
		}
		this.pending = Long.parseLong(req.getParameter("pending"));
		
		if (req.getParameter("hospitalizedCurrently") == null) {
			throw new IllegalArgumentException ("hospitalizedCurrently not valid.");
		}
		this.hospitalizedCurrently = Long.parseLong(req.getParameter("hospitalizedCurrently"));
		
		if (req.getParameter("hospitalizedCumulative") == null) {
			throw new IllegalArgumentException ("hospitalizedCumulative not valid.");
		}
		this.hospitalizedCumulative = Long.parseLong(req.getParameter("hospitalizedCumulative"));
		
		if (req.getParameter("inIcuCurrently") == null) {
			throw new IllegalArgumentException ("inIcuCurrently not valid.");
		}
		this.inIcuCurrently = Long.parseLong(req.getParameter("inIcuCurrently"));
		
		if (req.getParameter("inIcuCumulative") == null) {
			throw new IllegalArgumentException ("inIcuCumulative not valid.");
		}
		this.inIcuCumulative = Long.parseLong(req.getParameter("inIcuCumulative"));
		
		if (req.getParameter("onVentilatorCurrently") == null) {
			throw new IllegalArgumentException ("onVentilatorCurrently not valid.");
		}
		this.onVentilatorCurrently = Long.parseLong(req.getParameter("onVentilatorCurrently"));
		
		if (req.getParameter("onVentilatorCumulative") == null) {
			throw new IllegalArgumentException ("onVentilatorCumulative not valid.");
		}
		this.onVentilatorCumulative = Long.parseLong(req.getParameter("onVentilatorCumulative"));
		
		if (req.getParameter("dateChecked") == null) {
			throw new IllegalArgumentException ("dateChecked not valid.");
		}
		this.dateChecked = req.getParameter("dateChecked");
		
		if (req.getParameter("death") == null) {
			throw new IllegalArgumentException ("death not valid.");
		}
		this.death = Long.parseLong(req.getParameter("death"));
		
		if (req.getParameter("hospitalized") == null) {
			throw new IllegalArgumentException ("hospitalized not valid.");
		}
		this.hospitalized = Long.parseLong(req.getParameter("hospitalized"));
		
		if (req.getParameter("totalTestResults") == null) {
			throw new IllegalArgumentException ("totalTestResults not valid.");
		}
		this.totalTestResults = Long.parseLong(req.getParameter("totalTestResults"));
		
		if (req.getParameter("lastModified") == null) {
			throw new IllegalArgumentException ("lastModified not valid.");
		}
		this.lastModified = req.getParameter("lastModified");
		
		if (req.getParameter("deathIncrease") == null) {
			throw new IllegalArgumentException ("deathIncrease not valid.");
		}
		this.deathIncrease = Long.parseLong(req.getParameter("deathIncrease"));
		
		if (req.getParameter("hospitalizedIncrease") == null) {
			throw new IllegalArgumentException ("hospitalizedIncrease not valid.");
		}
		this.hospitalizedIncrease = Long.parseLong(req.getParameter("hospitalizedIncrease"));
		
		if (req.getParameter("negativeIncrease") == null) {
			throw new IllegalArgumentException ("negativeIncrease not valid.");
		}
		this.negativeIncrease = Long.parseLong(req.getParameter("negativeIncrease"));
		
		if (req.getParameter("positiveIncrease") == null) {
			throw new IllegalArgumentException ("positiveIncrease not valid.");
		}
		this.positiveIncrease = Long.parseLong(req.getParameter("positiveIncrease"));
		
		if (req.getParameter("totalTestResultIncrease") == null) {
			throw new IllegalArgumentException ("totalTestResultIncrease not valid.");
		}
		this.totalTestResultIncrease = Long.parseLong(req.getParameter("totalTestResultIncrease"));
	}

	public Long getDate() {
		return date;
	}

	public Long getStates() {
		return states;
	}

	public Long getPositive() {
		return positive;
	}

	public Long getNegative() {
		return negative;
	}

	public Long getPending() {
		return pending;
	}

	public Long getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	public Long getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	public Long getInIcuCurrently() {
		return inIcuCurrently;
	}

	public Long getInIcuCumulative() {
		return inIcuCumulative;
	}

	public Long getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	public Long getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	public String getDateChecked() {
		return dateChecked;
	}

	public Long getDeath() {
		return death;
	}

	public Long getHospitalized() {
		return hospitalized;
	}

	public Long getTotalTestResults() {
		return totalTestResults;
	}

	public String getLastModified() {
		return lastModified;
	}

	public Long getDeathIncrease() {
		return deathIncrease;
	}

	public Long getHospitalizedIncrease() {
		return hospitalizedIncrease;
	}

	public Long getNegativeIncrease() {
		return negativeIncrease;
	}

	public Long getPositiveIncrease() {
		return positiveIncrease;
	}

	public Long getTotalTestResultIncrease() {
		return totalTestResultIncrease;
	}
	
}
