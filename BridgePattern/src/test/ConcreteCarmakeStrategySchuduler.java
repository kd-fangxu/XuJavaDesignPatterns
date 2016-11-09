package test;

/**
 * Created by developer on 2016/11/4.
 */
public class ConcreteCarmakeStrategySchuduler extends CarMakeStrategySchuduler {
    @Override
    public void doMakeCar() {
        icarMakeStrategy.makeCar("aidi","白色");
    }
}
