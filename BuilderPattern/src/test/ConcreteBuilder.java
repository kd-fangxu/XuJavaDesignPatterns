package test;

/**
 * Created by developer on 2016/11/2.
 */
public class ConcreteBuilder extends Builder {
    Robot robot = new Robot();

    @Override
    public void buildWing() {
        robot.setSwing("添加翅膀");
    }

    @Override
    public void buildWeapon() {
        robot.setWeapon("添加武器");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
