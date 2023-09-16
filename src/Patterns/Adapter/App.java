package Patterns.Adapter;

import Patterns.Adapter.Meteo.AdapterST500Info;
import Patterns.Adapter.Meteo.MS200;
import Patterns.Adapter.Meteo.MeteoSensor;
import Patterns.Adapter.Meteo.MeteoStore;
import Patterns.Adapter.Meteo.ST500Info;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        MeteoStore meteoDB = new MeteoStore();

        MeteoSensor oldSensor = new MS200(1);
        meteoDB.save(oldSensor);

        meteoDB.save(new AdapterST500Info(new ST500Info().getData()));
    }
}
