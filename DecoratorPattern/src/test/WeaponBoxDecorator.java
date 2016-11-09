package test;

/**
 * Created by developer on 2016/10/12.
 */
public class WeaponBoxDecorator extends  BaseWeapon {
    BaseWeapon baseWeapon;

    public BaseWeapon getBaseWeapon() {
        return baseWeapon;
    }

    public void setBaseWeapon(BaseWeapon baseWeapon) {
        this.baseWeapon = baseWeapon;
    }


    @Override
    public void attack() {
        if (null!=baseWeapon){
            baseWeapon.attack();
        }
    }
}
