package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 2016/11/8.
 */
public class ObjectVisitStructure {
    private List<Element> elementList=new ArrayList<Element>();


    public void addElement(Element element){
        elementList.add(element);
    }

    public void removeElement(Element element){
        elementList.remove(element);
    }

    public void visit(Visitor visitor){
        for (Element e :elementList)
        {
         e.Accept(visitor);
        }
    }
}
