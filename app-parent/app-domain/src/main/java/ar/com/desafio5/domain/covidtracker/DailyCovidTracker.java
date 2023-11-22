package ar.com.desafio5.domain.covidtracker;

import ar.com.desafio5.domain.Entity;

public class DailyCovidTracker extends Entity {
	
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
	private Long totalTestResultsIncrease;
	
//	ESTO NO LLEVA VERIFICACION PORQUE LOS PRIMEROS JSON TRAEN MUCHOS DATOS null
	public DailyCovidTracker(Long id, Long date, Long states, Long positive, Long negative, Long pending,
			Long hospitalizedCurrently, Long hospitalizedCumulative, Long inIcuCurrently, Long inIcuCumulative,
			Long onVentilatorCurrently, Long onVentilatorCumulative, String dateChecked, Long death,
			Long hospitalized, Long totalTestResults, String lastModified, Long deathIncrease,
			Long hospitalizedIncrease, Long negativeIncrease, Long positiveIncrease, Long totalTestResultsIncrease) {
		setId(id);
		init(date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently,
				inIcuCumulative, onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized,
				totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease,
				totalTestResultsIncrease);
	}
	
	public DailyCovidTracker(Long date, Long states, Long positive, Long negative, Long pending,
			Long hospitalizedCurrently, Long hospitalizedCumulative, Long inIcuCurrently, Long inIcuCumulative,
			Long onVentilatorCurrently, Long onVentilatorCumulative, String dateChecked, Long death,
			Long hospitalized, Long totalTestResults, String lastModified, Long deathIncrease,
			Long hospitalizedIncrease, Long negativeIncrease, Long positiveIncrease, Long totalTestResultsIncrease) {
		init(date, states, positive, negative, pending, hospitalizedCurrently, hospitalizedCumulative, inIcuCurrently,
				inIcuCumulative, onVentilatorCurrently, onVentilatorCumulative, dateChecked, death, hospitalized,
				totalTestResults, lastModified, deathIncrease, hospitalizedIncrease, negativeIncrease, positiveIncrease,
				totalTestResultsIncrease);
	}

	private void init(Long date, Long states, Long positive, Long negative, Long pending, Long hospitalizedCurrently,
			Long hospitalizedCumulative, Long inIcuCurrently, Long inIcuCumulative, Long onVentilatorCurrently,
			Long onVentilatorCumulative, String dateChecked, Long death, Long hospitalized, Long totalTestResults,
			String lastModified, Long deathIncrease, Long hospitalizedIncrease, Long negativeIncrease,
			Long positiveIncrease, Long totalTestResultsIncrease) {
		this.date = date;
		this.states = states;
		this.positive = positive;
		this.negative = negative;
		this.pending = pending;
		this.hospitalizedCurrently = hospitalizedCurrently;
		this.hospitalizedCumulative = hospitalizedCumulative;
		this.inIcuCurrently = inIcuCurrently;
		this.inIcuCumulative = inIcuCumulative;
		this.onVentilatorCurrently = onVentilatorCurrently;
		this.onVentilatorCumulative = onVentilatorCumulative;
		this.dateChecked = dateChecked;
		this.death = death;
		this.hospitalized = hospitalized;
		this.totalTestResults = totalTestResults;
		this.lastModified = lastModified;
		this.deathIncrease = deathIncrease;
		this.hospitalizedIncrease = hospitalizedIncrease;
		this.negativeIncrease = negativeIncrease;
		this.positiveIncrease = positiveIncrease;
		this.totalTestResultsIncrease = totalTestResultsIncrease;
	}
	
	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Long getStates() {
		return states;
	}

	public void setStates(Long states) {
		this.states = states;
	}

	public Long getPositive() {
		return positive;
	}

	public void setPositive(Long positive) {
		this.positive = positive;
	}

	public Long getNegative() {
		return negative;
	}

	public void setNegative(Long negative) {
		this.negative = negative;
	}

	public Long getPending() {
		return pending;
	}

	public void setPending(Long pending) {
		this.pending = pending;
	}

	public Long getHospitalizedCurrently() {
		return hospitalizedCurrently;
	}

	public void setHospitalizedCurrently(Long hospitalizedCurrently) {
		this.hospitalizedCurrently = hospitalizedCurrently;
	}

	public Long getHospitalizedCumulative() {
		return hospitalizedCumulative;
	}

	public void setHospitalizedCumulative(Long hospitalizedCumulative) {
		this.hospitalizedCumulative = hospitalizedCumulative;
	}

	public Long getInIcuCurrently() {
		return inIcuCurrently;
	}

	public void setInIcuCurrently(Long inIcuCurrently) {
		this.inIcuCurrently = inIcuCurrently;
	}

	public Long getInIcuCumulative() {
		return inIcuCumulative;
	}

	public void setInIcuCumulative(Long inIcuCumulative) {
		this.inIcuCumulative = inIcuCumulative;
	}

	public Long getOnVentilatorCurrently() {
		return onVentilatorCurrently;
	}

	public void setOnVentilatorCurrently(Long onVentilatorCurrently) {
		this.onVentilatorCurrently = onVentilatorCurrently;
	}

	public Long getOnVentilatorCumulative() {
		return onVentilatorCumulative;
	}

	public void setOnVentilatorCumulative(Long onVentilatorCumulative) {
		this.onVentilatorCumulative = onVentilatorCumulative;
	}

	public String getDateChecked() {
		return dateChecked;
	}

	public void setDateChecked(String dateChecked) {
		this.dateChecked = dateChecked;
	}

	public Long getDeath() {
		return death;
	}

	public void setDeath(Long death) {
		this.death = death;
	}

	public Long getHospitalized() {
		return hospitalized;
	}

	public void setHospitalized(Long hospitalized) {
		this.hospitalized = hospitalized;
	}

	public Long getTotalTestResults() {
		return totalTestResults;
	}

	public void setTotalTestResults(Long totalTestResults) {
		this.totalTestResults = totalTestResults;
	}

	public String getLastModified() {
		return lastModified;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public Long getDeathIncrease() {
		return deathIncrease;
	}

	public void setDeathIncrease(Long deathIncrease) {
		this.deathIncrease = deathIncrease;
	}

	public Long getHospitalizedIncrease() {
		return hospitalizedIncrease;
	}

	public void setHospitalizedIncrease(Long hospitalizedIncrease) {
		this.hospitalizedIncrease = hospitalizedIncrease;
	}

	public Long getNegativeIncrease() {
		return negativeIncrease;
	}

	public void setNegativeIncrease(Long negativeIncrease) {
		this.negativeIncrease = negativeIncrease;
	}

	public Long getPositiveIncrease() {
		return positiveIncrease;
	}

	public void setPositiveIncrease(Long positiveIncrease) {
		this.positiveIncrease = positiveIncrease;
	}

	public Long gettotalTestResultsIncrease() {
		return totalTestResultsIncrease;
	}

	public void settotalTestResultsIncrease(Long totalTestResultsIncrease) {
		this.totalTestResultsIncrease = totalTestResultsIncrease;
	}

	@Override
	public String toString() {
		return "DailyCovidTracker: \n [id=" + id + ",\n date=" + date + ",\n states=" + states + ",\n positive=" + positive
				+ ",\n negative=" + negative + ",\n pending=" + pending + ",\n hospitalizedCurrently=" + hospitalizedCurrently
				+ ",\n hospitalizedCumulative=" + hospitalizedCumulative + ",\n inIcuCurrently=" + inIcuCurrently
				+ ",\n inIcuCumulative=" + inIcuCumulative + ",\n onVentilatorCurrently=" + onVentilatorCurrently
				+ ",\n onVentilatorCumulative=" + onVentilatorCumulative + ",\n dateChecked=" + dateChecked + ",\n death="
				+ death + ",\n hospitalized=" + hospitalized + ",\n totalTestResults=" + totalTestResults
				+ ",\n lastModified=" + lastModified + ",\n deathIncrease=" + deathIncrease + ",\n hospitalizedIncrease="
				+ hospitalizedIncrease + ",\n negativeIncrease=" + negativeIncrease + ",\n positiveIncrease="
				+ positiveIncrease + ",\n totalTestResultsIncrease=" + totalTestResultsIncrease + "]\n";
	}
	
}
