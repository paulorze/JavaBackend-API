
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "front_default",
    "front_female"
})
@Generated("jsonschema2pojo")
public class Icons__1 {

    @JsonProperty("front_default")
    public String frontDefault;
    @JsonProperty("front_female")
    public Object frontFemale;

}
