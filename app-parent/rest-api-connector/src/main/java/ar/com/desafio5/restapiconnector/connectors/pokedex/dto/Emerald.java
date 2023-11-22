
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "front_default",
    "front_shiny"
})
@Generated("jsonschema2pojo")
public class Emerald {

    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_shiny")
    public String frontShiny;

}
