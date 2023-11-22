
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "move",
    "version_group_details"
})
@Generated("jsonschema2pojo")
public class MovePre {

    @JsonProperty("move")
    public MoveJson move;
    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> versionGroupDetails;
}
