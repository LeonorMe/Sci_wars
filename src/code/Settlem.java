package code;

import java.util.ArrayList;

public class Settlem {
    int id;
    int location;
    int size;
    int ownerID;

    int defense;
    int income = 0; // income = sum(rate: buildings)

    ArrayList<Buildings> buildingsList = new ArrayList<Buildings>();

    public Settlem(int id, int location, int size, int ownerID) {
        this.id = id;
        this.location = location;
        this.size = size;
        this.ownerID = ownerID;
    }

    public int getIncome() {
        income = 0;
        for(Buildings building: this.buildingsList){
            income += building.rate;
        }
        return income;
    }
}
