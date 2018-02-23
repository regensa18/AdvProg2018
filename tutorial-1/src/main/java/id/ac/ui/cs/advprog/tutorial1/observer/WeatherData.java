package id.ac.ui.cs.advprog.tutorial1.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList<Observer> observers;

    public void measurementsChanged() {
        notifyObservers();
    }
    
    public WeatherData() {
    	observers = new ArrayList<>();
    }
    
    public void addObserver(Observer other){
    	observers.add(other);
    }
    
    public void notifyObservers() {
    	ArrayList<Float> newData = new ArrayList<>();
    	newData.add(this.temperature);
    	newData.add(this.humidity);
    	newData.add(this.pressure);
    	for(int i = 0; i < observers.size(); i++){
    		observers.get(i).update(this, newData);
    	}
    }

    public void setMeasurements(float temperature, float humidity,
                                float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        // TODO Complete me!
    	return this.temperature;
    }

    public void setTemperature(float temperature) {
        // TODO Complete me!
    	this.temperature = temperature;
    	measurementsChanged();
    }

    public float getHumidity() {
        // TODO Complete me!
        return this.humidity;
    }

    public void setHumidity(float humidity) {
        // TODO Complete me!
    	this.humidity = humidity;
    	measurementsChanged();
    }

    public float getPressure() {
        // TODO Complete me!
        return this.pressure;
    }

    public void setPressure(float pressure) {
        // TODO Complete me!
    	this.pressure = pressure;
    	measurementsChanged();
    }
}
