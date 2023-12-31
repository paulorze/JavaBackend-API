
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "game_index",
    "version"
})
@Generated("jsonschema2pojo")
public class GameIndex {

    @JsonProperty("game_index")
    public Integer gameIndex;
    @JsonProperty("version")
    public Version version;

}
