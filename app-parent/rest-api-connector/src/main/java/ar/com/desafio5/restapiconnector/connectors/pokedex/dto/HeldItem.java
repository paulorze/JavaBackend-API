package ar.com.desafio5.restapiconnector.connectors.pokedex.dto;

import jakarta.annotation.Generated;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item",
    "version_details"
})
@Generated("jsonschema2pojo")
public class HeldItem {

    @JsonProperty("item")
    public ItemJson item;

    @JsonProperty("version_details")
    public List<VersionDetail> versionDetails;
}
