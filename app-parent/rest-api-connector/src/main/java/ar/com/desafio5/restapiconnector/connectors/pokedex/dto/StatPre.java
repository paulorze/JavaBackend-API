
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_stat",
    "effort",
    "stat"
})
@Generated("jsonschema2pojo")
public class StatPre {

    @JsonProperty("base_stat")
    public Integer baseStat;
    @JsonProperty("effort")
    public Integer effort;
    @JsonProperty("stat")
    public StatJson stat;

}
