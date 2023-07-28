package code;

public class BulidingDeffense extends Buildings{
    public BulidingDeffense(int type, int size, int level, User user, Settlem settle) {
        super(type, size, level, user, settle);
    }
    @Override
    public void produce(User user, Settlem settle) {
        user.units++;
        settle.defense++;
    }
}
