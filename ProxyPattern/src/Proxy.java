/**
 * Created by developer on 2016/10/17.
 */
public class Proxy implements IdoSth {
    RealWorker realWorker;

    public Proxy(RealWorker realWorker) {
        this.realWorker = realWorker;
    }

    @Override
    public void doWorkA() {
        realWorker.doWorkA();
    }

    @Override
    public void doWorkB() {
        realWorker.doWorkB();
    }
}
