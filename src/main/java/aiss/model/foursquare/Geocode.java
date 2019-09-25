
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
    "what",
    "where",
    "feature",
    "parents"
})
public class Geocode {

    @JsonProperty("what")
    private String what;
    @JsonProperty("where")
    private String where;
    @JsonProperty("feature")
    private Feature feature;
    @JsonProperty("parents")
    private List<Object> parents = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("what")
    public String getWhat() {
        return what;
    }

    @JsonProperty("what")
    public void setWhat(String what) {
        this.what = what;
    }

    @JsonProperty("where")
    public String getWhere() {
        return where;
    }

    @JsonProperty("where")
    public void setWhere(String where) {
        this.where = where;
    }

    @JsonProperty("feature")
    public Feature getFeature() {
        return feature;
    }

    @JsonProperty("feature")
    public void setFeature(Feature feature) {
        this.feature = feature;
    }

    @JsonProperty("parents")
    public List<Object> getParents() {
        return parents;
    }

    @JsonProperty("parents")
    public void setParents(List<Object> parents) {
        this.parents = parents;
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
