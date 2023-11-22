
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ability",
    "is_hidden",
    "slot"
})
@Generated("jsonschema2pojo")
public class AbilityPre {

    @JsonProperty("ability")
    public AbilityJson ability;
    @JsonProperty("is_hidden")
    public Boolean isHidden;
    @JsonProperty("slot")
    public Integer slot;

}
