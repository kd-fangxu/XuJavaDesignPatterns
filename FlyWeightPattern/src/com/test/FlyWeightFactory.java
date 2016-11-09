package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by developer on 2016/11/8.
 */
public class FlyWeightFactory {
    Map<String,Object > container=new HashMap<String,Object>();
    public Object getObByKey(String key){
        if (!container.containsValue(key)){
            container.put(key,new ConcreteFltWeight());
        }
        return  container.get(key);

    }
}
