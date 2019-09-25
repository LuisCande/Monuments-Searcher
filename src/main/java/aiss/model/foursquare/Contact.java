
package aiss.model.foursquare;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phone",
    "formattedPhone",
    "facebook",
    "facebookUsername",
    "facebookName",
    "twitter"
})
public class Contact {

    @JsonProperty("phone")
    private String phone;
    @JsonProperty("formattedPhone")
    private String formattedPhone;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("facebookUsername")
    private String facebookUsername;
    @JsonProperty("facebookName")
    private String facebookName;
    @JsonProperty("twitter")
    private String twitter;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("formattedPhone")
    public String getFormattedPhone() {
        return formattedPhone;
    }

    @JsonProperty("formattedPhone")
    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @JsonProperty("facebookUsername")
    public String getFacebookUsername() {
        return facebookUsername;
    }

    @JsonProperty("facebookUsername")
    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    @JsonProperty("facebookName")
    public String getFacebookName() {
        return facebookName;
    }

    @JsonProperty("facebookName")
    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
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
