
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_shiny",
    "front_default",
    "front_shiny",
    "front_transparent"
})
@Generated("jsonschema2pojo")
public class Gold {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_shiny")
    public String backShiny;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_shiny")
    public String frontShiny;
    @JsonProperty("front_transparent")
    public String frontTransparent;

}
