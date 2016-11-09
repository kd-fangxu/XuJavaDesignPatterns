package test;

/**
 * Created by developer on 2016/10/12.
 */
public  abstract class CarMakeStrategySchuduler {
    IcarMakeStrategy icarMakeStrategy;

    public IcarMakeStrategy getIcarMakeStrategy() {
        return icarMakeStrategy;
    }
    public void setIcarMakeStrategy(IcarMakeStrategy icarMakeStrategy) {
        this.icarMakeStrategy = icarMakeStrategy;
    }


//    public void doMakeCar() {
//        if (null != icarMakeStrategy) {
//            icarMakeStrategy.makeCar("ChuangShiji","White");
//        }
//    }

    public abstract void doMakeCar();
}
