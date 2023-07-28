package code;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String password;
    private String email;

    int powerlevel;
    int gold;
    int units; // max 20
    int income;

    int avatar;
    int localization;

    ArrayList<Settlem> settlementsList = new ArrayList<Settlem>();
    ArrayList<Buildings> buildingsList = new ArrayList<Buildings>();
    ArrayList<Units> unitsList = new ArrayList<Units>();

    // TODO verificaçoes
    public User(int id, String name, String password, String email, int powerlevel) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.powerlevel = powerlevel;
    }

    public boolean addSettlement(Settlem settle){
        for (Settlem s : this.settlementsList) {
            if (s.id == settle.id) {
                System.out.println("Settlement already exists");
                return false;
            }
        }
        this.settlementsList.add(settle);
        return true;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public int getId(){
        return this.id;
    }

    public int getPowerLevel(){
        return this.powerlevel;
    }

    public ArrayList<Units> getUnits() {
        return this.unitsList;
    }
}
