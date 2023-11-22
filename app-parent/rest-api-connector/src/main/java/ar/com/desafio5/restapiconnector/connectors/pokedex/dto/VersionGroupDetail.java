
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level_learned_at",
    "move_learn_method",
    "version_group"
})
@Generated("jsonschema2pojo")
public class VersionGroupDetail {

    @JsonProperty("level_learned_at")
    public Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    public MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    public VersionGroup versionGroup;

}
