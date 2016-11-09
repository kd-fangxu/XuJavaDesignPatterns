package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 2016/11/4.
 */
public class StudyGroup extends Banji {
    List<Banji> obList = new ArrayList<Banji>();

    @Override
    public void jiaozZuoYe() {
        System.out.println(getName() + "交作业");
        for (Banji item : obList) {
            item.jiaozZuoYe();
        }
    }

    @Override
    public void addSubOb(Banji subOb) {
        obList.add(subOb);
    }

    @Override
    public void removeSubob(Banji subOb) {
        obList.remove(subOb);

    }
}
