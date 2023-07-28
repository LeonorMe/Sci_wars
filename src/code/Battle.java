package code;

public class Battle {
    User user1;
    User user2;

    public Battle(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public User autoBattle() {
        if(user1.units > user2.units){
            user1.gold += user2.gold/2;
            user2.gold /= 2;
            return user1;
        } else if(user1.units < user2.units){
            user2.gold += user1.gold/2;
            user1.gold /= 2;
            return user2;
        }else{
            user1.gold /= 2;
            user2.gold /= 2;
            return null;
        }
    }

    public User manualBattle(int user1Units, int user2Units) {
        Map battleMap = new Map(200);

        while(user1Units > 0 && user2Units > 0){
            Units atckUnit = selectUnits()[0];
            Units defUnit =  selectUnits()[1];
            attack(atckUnit, defUnit);
        }

        return null;
    }

    private Units[] selectUnits() {
        Units[] units = new Units[2];
        units[0] = user1.getUnits().get(0);
        units[1] = user2.getUnits().get(0);
        return units;
    }

    private void attack(Units atckUnit, Units defUnit) {
        if(atckUnit.xp > defUnit.def)
            defUnit.hp -= atckUnit.xp - defUnit.def;
        else
            atckUnit.hp -= defUnit.def - atckUnit.xp;
    }
}
