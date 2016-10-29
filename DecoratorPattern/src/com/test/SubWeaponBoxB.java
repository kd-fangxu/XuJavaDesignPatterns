package com.test;

/**
 * Created by developer on 2016/10/12.
 */
public class SubWeaponBoxB extends WeaponBoxDecorator {
    @Override
    public void attack() {
        if (baseWeapon != null) {
            System.out.println("boxB伤害");
            baseWeapon.attack();
        }
        extraAttack();
    }

    private void extraAttack() {
        System.out.println("boxB额外伤害");
    }
}
