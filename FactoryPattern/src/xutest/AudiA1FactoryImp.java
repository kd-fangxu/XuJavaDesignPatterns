package xutest;

/**
 * Created by developer on 2016/10/17.
 */
public class AudiA1FactoryImp implements ICaMakeFactory {
    @Override
    public Car makeCar(String name, String color) {
        AudiA1 audiA1=new AudiA1();
        audiA1.setName(name);
        audiA1.setColor(color);
        return audiA1;
    }
}
