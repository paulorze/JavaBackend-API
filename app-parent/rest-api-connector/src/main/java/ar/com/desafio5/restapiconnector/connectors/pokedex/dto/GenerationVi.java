
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "omegaruby-alphasapphire",
    "x-y"
})
@Generated("jsonschema2pojo")
public class GenerationVi {

    @JsonProperty("omegaruby-alphasapphire")
    public OmegarubyAlphasapphire omegarubyAlphasapphire;
    @JsonProperty("x-y")
    public XY xY;

}
