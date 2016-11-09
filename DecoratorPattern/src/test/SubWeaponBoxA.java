package test;

/**
 * Created by developer on 2016/10/12.
 */
public class SubWeaponBoxA extends WeaponBoxDecorator {
    @Override
    public void attack() {
        if (baseWeapon != null) {
            System.out.println("boxA伤害");
            baseWeapon.attack();
        }
        extraAttack();

    }

    private void extraAttack() {
        System.out.println("boxA额外伤害");
    }
}
