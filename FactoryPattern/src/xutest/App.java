package xutest;

/**
 * Created by developer on 2016/10/12.
 */
public class App {
    public static void main(String[] args) {
    ICaMakeFactory iCaMakeFactory=new AudiA1FactoryImp();
        iCaMakeFactory.makeCar("audiA1","白色").run();
        new AudiA3Factory().makeCar("AudiA3","黑色").run();
    }

}
