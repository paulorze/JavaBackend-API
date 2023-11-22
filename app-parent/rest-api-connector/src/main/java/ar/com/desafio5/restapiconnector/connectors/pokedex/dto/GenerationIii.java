
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
@Generated("jsonschema2pojo")
public class GenerationIii {

    @JsonProperty("emerald")
    public Emerald emerald;
    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    public RubySapphire rubySapphire;

}
