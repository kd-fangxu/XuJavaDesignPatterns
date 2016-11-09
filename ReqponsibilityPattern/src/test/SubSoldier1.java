package test;

/**
 * Created by developer on 2016/11/8.
 */
public class SubSoldier1 extends Soldier {
    @Override
    public void fightWith(Enermy enermy) {
        if (enermy.powerLevel < 10){
            System.out.println("战士1完虐对手");
        }else{
            System.out.println("战士1无法打败对手  请求大哥");
            getSoldier().fightWith(enermy);
        }

    }
}
