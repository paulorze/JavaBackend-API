
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rarity",
    "version"
})
@Generated("jsonschema2pojo")
public class VersionDetail {

    @JsonProperty("rarity")
    public Integer rarity;
    @JsonProperty("version")
    public Version__1 version;

}
