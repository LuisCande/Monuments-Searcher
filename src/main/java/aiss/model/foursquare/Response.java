
package aiss.model.foursquare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "venues",
    "confident",
    "geocode"
})
public class Response {

    @JsonProperty("venues")
    private List<Venue> venues = null;
    @JsonProperty("confident")
    private Boolean confident;
    @JsonProperty("geocode")
    private Geocode geocode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("venues")
    public List<Venue> getVenues() {
        return venues;
    }

    @JsonProperty("venues")
    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    @JsonProperty("confident")
    public Boolean getConfident() {
        return confident;
    }

    @JsonProperty("confident")
    public void setConfident(Boolean confident) {
        this.confident = confident;
    }

    @JsonProperty("geocode")
    public Geocode getGeocode() {
        return geocode;
    }

    @JsonProperty("geocode")
    public void setGeocode(Geocode geocode) {
        this.geocode = geocode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
