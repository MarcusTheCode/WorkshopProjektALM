package com.company;

public class CO2Sensor extends Sensorer {
    String type;
    double value;
    int id;
    String unit;
    CO2Sensor(String type, double value, int id, String unit){
        super(type, value, id);
        this.type = type;
        this.value = value;
        this.id = id;
        this.unit = unit;
    }
    public double getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void printValue(){
        System.out.println(value);
    }
}
