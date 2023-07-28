package code;

public class BuildingUnits extends Buildings {
    public BuildingUnits(int type, int size, int level, User user, Settlem settle) {
        super(type, size, level, user, settle);
    }

    @Override
    public void produce(User user, Settlem settle) {
        if (user.units< this.level * rate )
            System.out.println("Not enough gold");
        else
            user.units += this.level * rate;
    }
}
