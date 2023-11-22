
package ar.com.desafio5.restapiconnector.connectors.users.dto;

import jakarta.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "username",
    "email",
    "address",
    "phone",
    "website",
    "company"
})
@Generated("jsonschema2pojo")
public class UserJson {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("username")
    public String username;
    @JsonProperty("email")
    public String email;
    @JsonProperty("address")
    public AddressJson address;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("website")
    public String website;
    @JsonProperty("company")
    public CompanyJson company;

}
