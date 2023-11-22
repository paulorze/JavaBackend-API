
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "crystal",
    "gold",
    "silver"
})
@Generated("jsonschema2pojo")
public class GenerationIi {

    @JsonProperty("crystal")
    public Crystal crystal;
    @JsonProperty("gold")
    public Gold gold;
    @JsonProperty("silver")
    public Silver silver;

}
