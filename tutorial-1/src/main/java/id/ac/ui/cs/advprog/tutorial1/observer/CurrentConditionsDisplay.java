package id.ac.ui.cs.advprog.tutorial1.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        // TODO Complete me!
    	observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            // TODO Complete me!
        	if(arg instanceof ArrayList<?>){
        		ArrayList<Float> newData = (ArrayList<Float>) arg;
        		this.temperature = newData.get(0);
        		this.humidity = newData.get(1);
        		display();
        	}
        }
    }
}
