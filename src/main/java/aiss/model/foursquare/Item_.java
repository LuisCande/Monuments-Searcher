
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
    "reasons",
    "venue",
    "tips",
    "referralId"
})
public class Item_ {

    @JsonProperty("reasons")
    private Reasons reasons;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("tips")
    private List<Tip> tips = null;
    @JsonProperty("referralId")
    private String referralId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reasons")
    public Reasons getReasons() {
        return reasons;
    }

    @JsonProperty("reasons")
    public void setReasons(Reasons reasons) {
        this.reasons = reasons;
    }

    @JsonProperty("venue")
    public Venue getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @JsonProperty("tips")
    public List<Tip> getTips() {
        return tips;
    }

    @JsonProperty("tips")
    public void setTips(List<Tip> tips) {
        this.tips = tips;
    }

    @JsonProperty("referralId")
    public String getReferralId() {
        return referralId;
    }

    @JsonProperty("referralId")
    public void setReferralId(String referralId) {
        this.referralId = referralId;
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
