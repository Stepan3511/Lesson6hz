import io.restassured.RestAssured;
import io.restassured.response.Response;


import java.io.IOException;

import static io.restassured.RestAssured.given;

public class Main {

    public static void main(String[] args) throws IOException {

        RestAssured.baseURI = "http://dataservice.accuweather.com/";

        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/291605?apikey=4jkr9eHA2NOEGnZbATEfdyEeBhhG41iR");

        if(response.getStatusCode() == 200){
            System.out.println("Тест успешен");
        }
    }


}
