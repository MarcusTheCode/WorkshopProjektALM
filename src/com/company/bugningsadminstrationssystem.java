package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class bugningsadminstrationssystem {
    ArrayList<Building> buildings = new ArrayList<>();
    public static Building BCurrent;

    public void addbuilding() {
            Building newBuilding = new Building(5);
            buildings.add(newBuilding);
    }


    public void removebuilding(int inId){
            buildings.remove(inId);
    }

    public void getbuilding (int id){

            BCurrent = buildings.get(id);

    }

}



