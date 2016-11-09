package test;

/**
 * Created by developer on 2016/11/8.
 */
public abstract class Soldier {
    public  Soldier soldier;

    public Soldier getSoldier() {
        return soldier;
    }

    public void setMorePowerSoldier(Soldier soldier) {
        this.soldier = soldier;
    }

    public abstract void fightWith(Enermy enermy);
}
