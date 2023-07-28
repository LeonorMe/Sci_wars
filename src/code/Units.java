package code;

public abstract class Units {
    int xp;
    int hp;
    int dmg;
    int def;
    int speed;
    int range;
    int cost;
    int team;
    int x;
    int y;
    int id;
    int type;
    int level;
    int size;
    int rate;
    int ownerID;
    User user;

    public Units(int type, int size, int level, User user) {
        this.type = type;
        this.size = size;
        this.level = level;
        this.user = user;
    }

}
