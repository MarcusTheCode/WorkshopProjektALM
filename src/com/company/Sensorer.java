package com.company;

public class Sensorer {
    public String sensorType;
    public double value;
    public int id;

    public Sensorer(String type, double value, int id){
        sensorType = type;
        this.value = value;
        this.id = id;
    }

}
