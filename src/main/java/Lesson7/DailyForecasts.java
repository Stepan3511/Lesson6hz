package Lesson7;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class DailyForecasts {

    @JsonProperty(value = "Date")
    private String date;
    @JsonProperty(value = "EpochDate")
    private String epochDate;
    @JsonProperty(value = "Lesson7.Temperature")
    private Temperature temperature;
    @JsonProperty(value = "Lesson7.Day")
    private Day day;
    @JsonProperty(value = "Lesson7.Night")
    private Night night;
    @JsonProperty(value = "Sources")
    private List<String> sources;
    @JsonProperty(value = "MobileLink")
    private String mobileLink;
    @JsonProperty(value = "Link")
    private String link;

    @JsonIgnore
    private String dayData;
    @JsonIgnore
    private String timeData;

}
