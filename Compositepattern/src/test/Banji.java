package test;

/**
 * Created by developer on 2016/11/4.
 */
public abstract class Banji {
    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public abstract void jiaozZuoYe();
    public abstract  void addSubOb(Banji subOb);
    public abstract  void removeSubob(Banji subOb);
}
