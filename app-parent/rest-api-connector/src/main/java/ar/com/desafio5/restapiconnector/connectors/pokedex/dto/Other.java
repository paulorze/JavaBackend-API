
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dream_world",
    "home",
    "official-artwork"
})
@Generated("jsonschema2pojo")
public class Other {

    @JsonProperty("dream_world")
    public DreamWorld dreamWorld;
    @JsonProperty("home")
    public Home home;
    @JsonProperty("official-artwork")
    public OfficialArtwork officialArtwork;

}
