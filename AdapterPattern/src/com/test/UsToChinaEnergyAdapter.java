package com.test;

/**
 * Created by developer on 2016/11/4.
 */
public class UsToChinaEnergyAdapter extends  EnergyAdapter {


    @Override
    public String translateEnergy() {
        localenergy=new UsEnergy();
        System.out.println("使用"+localenergy.privideEnergy()+"电源");
        System.out.println("适配器转换为220V中国标准电源");
        return "220V";
    }
}
