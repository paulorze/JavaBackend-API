
package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import java.util.List;
import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abilities",
    "base_experience",
    "forms",
    "game_indices",
    "height",
    "held_items",
    "id",
    "is_default",
    "location_area_encounters",
    "moves",
    "name",
    "order",
    "past_abilities",
    "past_types",
    "species",
    "sprites",
    "stats",
    "types",
    "weight"
})
@Generated("jsonschema2pojo")
public class PokemonJson {

    @JsonProperty("abilities")
    public List<AbilityPre> abilities;
    @JsonProperty("base_experience")
    public Integer baseExperience;
    @JsonProperty("forms")
    public List<FormJson> forms;
    @JsonProperty("game_indices")
    public List<GameIndex> gameIndices;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("held_items")
    public List<HeldItem> heldItems;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("is_default")
    public Boolean isDefault;
    @JsonProperty("location_area_encounters")
    public String locationAreaEncounters;
    @JsonProperty("moves")
    public List<MovePre> moves;
    @JsonProperty("name")
    public String name;
    @JsonProperty("order")
    public Integer order;
    @JsonProperty("past_abilities")
    public List<Object> pastAbilities;
    @JsonProperty("past_types")
    public List<Object> pastTypes;
    @JsonProperty("species")
    public SpeciesJson species;
    @JsonProperty("sprites")
    public SpritesJson sprites;
    @JsonProperty("stats")
    public List<StatPre> stats;
    @JsonProperty("types")
    public List<TypePre> types;
    @JsonProperty("weight")
    public Integer weight;

}
