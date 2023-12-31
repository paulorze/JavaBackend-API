
package ar.com.desafio5.restapiconnector.connectors.users.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "catchPhrase",
    "bs"
})
@Generated("jsonschema2pojo")
public class CompanyJson {

    @JsonProperty("name")
    public String name;
    @JsonProperty("catchPhrase")
    public String catchPhrase;
    @JsonProperty("bs")
    public String bs;

}
