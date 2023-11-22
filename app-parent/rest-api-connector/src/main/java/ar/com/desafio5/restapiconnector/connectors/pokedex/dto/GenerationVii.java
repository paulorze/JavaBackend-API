
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icons",
    "ultra-sun-ultra-moon"
})
@Generated("jsonschema2pojo")
public class GenerationVii {

    @JsonProperty("icons")
    public Icons icons;
    @JsonProperty("ultra-sun-ultra-moon")
    public UltraSunUltraMoon ultraSunUltraMoon;

}
