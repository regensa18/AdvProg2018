package id.ac.ui.cs.advprog.tutorial1.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        // TODO Complete me!
        observable.addObserver(this);
        numReadings = 0;
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            // TODO Complete me!
            if(arg instanceof ArrayList<?>){
                ArrayList<Float> newData = (ArrayList<Float>) arg;
                float temp = newData.get(0);
                if(minTemp == 200){
                    minTemp = temp;
                }
                if(maxTemp < temp){
                    maxTemp = temp;
                }
                if(minTemp > temp){
                    minTemp = temp;
                }
                tempSum += temp;
                numReadings += 1;
                display();
            }
        }
    }
}
