package com.company;

import java.util.ArrayList;
import java.util.List;

public class Building {
    public List<Sensorer> sensorerList;
    public List<Actuator> actuatorList;
    public int id;

    Building(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void addTempSensor(Sensorer s){
        sensorerList.add(s);
    }

    public void removeTempSensor(Sensorer s){
        sensorerList.remove(s);
    }

    public void addCO2Sensor(CO2Sensor c){
        sensorerList.add(c);
    }

    public void removeCO2Sensor(CO2Sensor c){
        sensorerList.remove(c);
    }

    public void removeActuator(Actuator a){
        actuatorList.remove(a);
    }

    public void addActuator(Actuator a){
        actuatorList.add(a);
    }
}
