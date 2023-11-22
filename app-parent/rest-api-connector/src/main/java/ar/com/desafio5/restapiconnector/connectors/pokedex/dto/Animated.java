
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_female",
    "back_shiny",
    "back_shiny_female",
    "front_default",
    "front_female",
    "front_shiny",
    "front_shiny_female"
})
@Generated("jsonschema2pojo")
public class Animated {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_female")
    public Object backFemale;
    @JsonProperty("back_shiny")
    public String backShiny;
    @JsonProperty("back_shiny_female")
    public Object backShinyFemale;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_female")
    public Object frontFemale;
    @JsonProperty("front_shiny")
    public String frontShiny;
    @JsonProperty("front_shiny_female")
    public Object frontShinyFemale;

}
