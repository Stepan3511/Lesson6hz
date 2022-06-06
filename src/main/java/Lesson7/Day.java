package Lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Day {

    @JsonProperty(value = "Icon")
    private String icon;
    @JsonProperty(value = "IconPhrase")
    private String iconPhrase;
    @JsonProperty(value = "HasPrecipitation")
    private boolean hasPrecipitation;
    @JsonProperty(value = "PrecipitationType")
    private String precipitationType;
    @JsonProperty(value = "PrecipitationIntensity")
    private String precipitationIntensity;

    Day(String icon, String iconPhrase, boolean hasPrecipitation) {
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
    }

    Day(String icon, String iconPhrase, boolean hasPrecipitation, String precipitationType, String precipitationIntensity) {
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.precipitationType = precipitationType;
        this.precipitationIntensity = precipitationIntensity;
    }

}
