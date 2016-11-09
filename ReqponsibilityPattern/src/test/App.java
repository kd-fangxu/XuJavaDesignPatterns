package test;

/**
 * Created by developer on 2016/11/8.
 */
public class App {
    public static void main(String[] args) {
        SubSoldier1 soldier1 = new SubSoldier1();
        SubSoldier2 subSoldier2 = new SubSoldier2();
        soldier1.setMorePowerSoldier(subSoldier2);

        Enermy enermy=new Enermy(11);
        soldier1.fightWith(enermy);
    }
}
