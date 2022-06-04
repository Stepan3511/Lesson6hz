package Lesson8;

public class main extends Forecasts {

    public static void main(String[] args) {

        DbConnection dbConnection = new DbConnection();
        parseResponse ParseResponse = new parseResponse();

        for (Forecasts dailyForecasts: ParseResponse.getForecasts()) {

            dbConnection.insertValue("Chita",
                    dailyForecasts.getDate(),
                    dailyForecasts.getDay().getIconPhrase(),
                    Double.parseDouble(dailyForecasts.getTemperature().getMinimum().getValue()));

        }

        System.out.println(dbConnection.getValue("localDate","temperature", 70.0));

    }

}
