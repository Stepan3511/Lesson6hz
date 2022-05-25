import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "http://dataservice.accuweather.com/";

        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/291605?apikey=4jkr9eHA2NOEGnZbATEfdyEeBhhG41iR");

        System.out.println(response.asPrettyString());

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/DailyForecasts");

        List<DailyForecasts> dailyForecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem,DailyForecasts.class));
            }

        }

        for (DailyForecasts dailyForecast : dailyForecasts) {
            System.out.println("В Чите " + dailyForecast.getDate() + " максимальная температура " +
                    dailyForecast.getTemperature().getMaximum().getValue() + " минимальная температура " +
                    dailyForecast.getTemperature().getMinimum().getValue());
        }

    }
}
