
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_gray",
    "back_transparent",
    "front_default",
    "front_gray",
    "front_transparent"
})
@Generated("jsonschema2pojo")
public class Yellow {

    @JsonProperty("back_default")
    public String backDefault;
    @JsonProperty("back_gray")
    public String backGray;
    @JsonProperty("back_transparent")
    public String backTransparent;
    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_gray")
    public String frontGray;
    @JsonProperty("front_transparent")
    public String frontTransparent;

}
