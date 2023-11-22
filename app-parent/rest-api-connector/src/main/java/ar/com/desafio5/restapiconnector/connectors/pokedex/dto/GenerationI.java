
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "red-blue",
    "yellow"
})
@Generated("jsonschema2pojo")
public class GenerationI {

    @JsonProperty("red-blue")
    public RedBlue redBlue;
    @JsonProperty("yellow")
    public Yellow yellow;

}
