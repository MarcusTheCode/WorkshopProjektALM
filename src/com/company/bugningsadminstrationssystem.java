package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class bugningsadminstrationssystem {
<<<<<<< HEAD
    ArrayList buildings = new ArrayList<String>();
=======
ArrayList<Building> buildings = new ArrayList<>();
    static Building BCurrent;

    public void addbuilding (){

   Building newbuilding = new Building(3);
>>>>>>> master

   buildings.add(newbuilding);

<<<<<<< HEAD
    }

    public void addbuilding (){
        Building newBuilding = new Building(5);
        buildings.add(newBuilding);
    }
=======


    }

    public void removebuilding (int id){
        buildings.remove((id));
    }

    public void getbuilding(int id){

        BCurrent = buildings.indexOf();
>>>>>>> master

    }
}



