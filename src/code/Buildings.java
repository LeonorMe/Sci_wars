package code;

public abstract class Buildings {
    final int RATE = 1;
    int type; // 0-income 1-units 2-support 3-defence 4-utility
    int size;
    int level;

    int rate; // produçao em x tempo
    int priceTopUpdate; // preço para atualizar para o proximo nivel
    User user;
    Settlem settle;

    final int MAXLEVEL = 10;

    public Buildings(int type, int size, int level, User user, Settlem settle) {
        this.type = type;
        this.size = size;
        this.level = level; // começa a 1
        this.user = user;
        this.settle = settle;
    }

    public int getType() {
        return type;
    }

    public abstract void produce(User user, Settlem settle);

    public void update(){
        if(this.level == MAXLEVEL)
            System.out.println("Max level");
        else if(user.gold < this.priceTopUpdate)
            System.out.println("Not enough gold");
        else{
            user.gold -= this.priceTopUpdate;
            this.level++;
        }
    }

    public void destroy(){
        this.settle.buildingsList.remove(this);
        user.gold += this.priceTopUpdate/2;
    }

    public int getRate(){
        this.rate = RATE * level;
        return this.rate;
    }

}
