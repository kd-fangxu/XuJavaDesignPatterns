package com.xutest;

/**
 * Created by developer on 2016/10/12.
 */
public class CarFactory {
    public static Car makeCar(String name ,String color){
      Car car = null;
        if (name.equals("AudiA1")){
            car=new AudiA1();
            car.setName(name);
            car.setColor(color);
            return  car;
        }else if (name.equals("AudiA3")){
            car=new AudiA3();
            car.setName(name);
            car.setColor(color);
            return car;
        }
        return car;
    };
}
