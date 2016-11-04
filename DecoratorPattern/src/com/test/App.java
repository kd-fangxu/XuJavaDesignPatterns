package com.test;

/**
 * Created by developer on 2016/10/12.
 */
public class App {//子类包含父类对象  实现 父类方法的琏式调用
    public static void main(String[] args) {
        SubWeaponBoxA boxA = new SubWeaponBoxA();
        boxA.setBaseWeapon(new SubWeapon());
        SubWeaponBoxB boxB = new SubWeaponBoxB();
        boxB.setBaseWeapon(boxA);
        boxB.attack();
    }
}
