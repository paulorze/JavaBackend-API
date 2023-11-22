
package ar.com.desafio5.restapiconnector.connectors.covidtracker.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "states",
    "positive",
    "negative",
    "pending",
    "hospitalizedCurrently",
    "hospitalizedCumulative",
    "inIcuCurrently",
    "inIcuCumulative",
    "onVentilatorCurrently",
    "onVentilatorCumulative",
    "dateChecked",
    "death",
    "hospitalized",
    "totalTestResults",
    "lastModified",
    "recovered",
    "total",
    "posNeg",
    "deathIncrease",
    "hospitalizedIncrease",
    "negativeIncrease",
    "positiveIncrease",
    "totalTestResultsIncrease",
    "hash"
})
@Generated("jsonschema2pojo")
public class DailyCovidTrackerJson {

    @JsonProperty("date")
    public Integer date;
    @JsonProperty("states")
    public Integer states;
    @JsonProperty("positive")
    public Integer positive;
    @JsonProperty("negative")
    public Integer negative;
    @JsonProperty("pending")
    public Integer pending;
    @JsonProperty("hospitalizedCurrently")
    public Integer hospitalizedCurrently;
    @JsonProperty("hospitalizedCumulative")
    public Integer hospitalizedCumulative;
    @JsonProperty("inIcuCurrently")
    public Integer inIcuCurrently;
    @JsonProperty("inIcuCumulative")
    public Integer inIcuCumulative;
    @JsonProperty("onVentilatorCurrently")
    public Integer onVentilatorCurrently;
    @JsonProperty("onVentilatorCumulative")
    public Integer onVentilatorCumulative;
    @JsonProperty("dateChecked")
    public String dateChecked;
    @JsonProperty("death")
    public Integer death;
    @JsonProperty("hospitalized")
    public Integer hospitalized;
    @JsonProperty("totalTestResults")
    public Integer totalTestResults;
    @JsonProperty("lastModified")
    public String lastModified;
    @JsonProperty("recovered")
    public Object recovered;
    @JsonProperty("total")
    public Integer total;
    @JsonProperty("posNeg")
    public Integer posNeg;
    @JsonProperty("deathIncrease")
    public Integer deathIncrease;
    @JsonProperty("hospitalizedIncrease")
    public Integer hospitalizedIncrease;
    @JsonProperty("negativeIncrease")
    public Integer negativeIncrease;
    @JsonProperty("positiveIncrease")
    public Integer positiveIncrease;
    @JsonProperty("totalTestResultsIncrease")
    public Integer totalTestResultsIncrease;
    @JsonProperty("hash")
    public String hash;

}
