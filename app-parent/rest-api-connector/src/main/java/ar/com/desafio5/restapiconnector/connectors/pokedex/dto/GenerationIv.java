
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})
@Generated("jsonschema2pojo")
public class GenerationIv {

    @JsonProperty("diamond-pearl")
    public DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver heartgoldSoulsilver;
    @JsonProperty("platinum")
    public Platinum platinum;

}
