package chapter.one.observer;

import chapter.one.observer.weatherobservable.CurrentConditionsDisplay;
import chapter.one.observer.weatherobservable.ForecastDisplay;
import chapter.one.observer.weatherobservable.StatisticsDisplay;
import chapter.one.observer.weatherobservable.WeatherData;

public class WeatherStationObservable {
    public static void main(String[] args) {
        WeatherData weatherDataOld = new WeatherData();

        CurrentConditionsDisplay currentDisplayOld = new CurrentConditionsDisplay(weatherDataOld);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataOld);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataOld);
                
        weatherDataOld.setMeasurements(80, 65, 30.4f);
        weatherDataOld.setMeasurements(82, 70, 29.2f);
        weatherDataOld.setMeasurements(78, 90, 29.2f);
    }
}
