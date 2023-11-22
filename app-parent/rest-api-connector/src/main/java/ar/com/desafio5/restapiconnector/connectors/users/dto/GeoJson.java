
package ar.com.desafio5.restapiconnector.connectors.users.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lat",
    "lng"
})
@Generated("jsonschema2pojo")
public class GeoJson {

    @JsonProperty("lat")
    public String lat;
    @JsonProperty("lng")
    public String lng;

}
