package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class bugningsadminstrationssystem {
    ArrayList buildings = new ArrayList<String>();

    public static void main(String[] args) {

    }

    public void addbuilding (){
        Building newBuilding = new Building(5);
        buildings.add(newBuilding);
    }

}



