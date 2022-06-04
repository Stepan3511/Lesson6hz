package Lesson7;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Temperature {

    @JsonProperty(value = "Lesson7.Minimum")
    private Minimum minimum;
    @JsonProperty(value = "Lesson7.Maximum")
    private Maximum maximum;


}
