package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class bugningsadminstrationssystem {
ArrayList<Building> buildings = new ArrayList<>();
    static Building BCurrent;

    public void addbuilding (){

   Building newbuilding = new Building(3);

   buildings.add(newbuilding);



    }

    public void removebuilding (int id){
        buildings.remove((id));
    }

    public void getbuilding(int id){

        BCurrent = buildings.indexOf();

    }
}



