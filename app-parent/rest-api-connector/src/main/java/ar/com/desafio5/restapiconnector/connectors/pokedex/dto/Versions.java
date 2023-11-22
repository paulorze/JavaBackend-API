
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "generation-i",
    "generation-ii",
    "generation-iii",
    "generation-iv",
    "generation-v",
    "generation-vi",
    "generation-vii",
    "generation-viii"
})
@Generated("jsonschema2pojo")
public class Versions {

    @JsonProperty("generation-i")
    public GenerationI generationI;
    @JsonProperty("generation-ii")
    public GenerationIi generationIi;
    @JsonProperty("generation-iii")
    public GenerationIii generationIii;
    @JsonProperty("generation-iv")
    public GenerationIv generationIv;
    @JsonProperty("generation-v")
    public GenerationV generationV;
    @JsonProperty("generation-vi")
    public GenerationVi generationVi;
    @JsonProperty("generation-vii")
    public GenerationVii generationVii;
    @JsonProperty("generation-viii")
    public GenerationViii generationViii;

}
