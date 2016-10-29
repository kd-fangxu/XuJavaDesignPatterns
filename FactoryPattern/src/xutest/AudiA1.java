package xutest;

/**
 * Created by developer on 2016/10/12.
 */
public class AudiA1 extends Car {
    @Override
    public void run() {
        super.run();
        System.out.println(getColor() + "的" + getName() + "run");
    }
}
