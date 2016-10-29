package xutest;

/**
 * Created by developer on 2016/10/17.
 */
public class AudiA3Factory implements  ICaMakeFactory {
    @Override
    public Car makeCar(String name, String color) {
        AudiA3 audiA3 =new AudiA3();
        audiA3.setName(name);
        audiA3.setColor(color);

        return audiA3;
    }
}
