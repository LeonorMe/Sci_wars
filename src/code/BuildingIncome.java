package code;

public class BuildingIncome extends Buildings{
    final int RATE = 10;
    public BuildingIncome(int type, int size, int level, User user, Settlem settle) {
        super(type, size, level, user, settle);
    }

    @Override
    public void produce(User user, Settlem settle) {
        user.gold += getRate();
        settle.income += getRate();
    }

}
