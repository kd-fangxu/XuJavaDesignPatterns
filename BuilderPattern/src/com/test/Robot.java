package com.test;

/**
 * Created by developer on 2016/11/2.
 */
public class Robot {
    String Model;
    String Name;
    String Swing;
    String Weapon;

    public String getModel() {
        return Model;
    }

    public String getSwing() {
        return Swing;
    }

    public void setSwing(String swing) {
        Swing = swing;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void run(){
        System.out.println(this.getSwing()+" "+this.getWeapon());
    }
}
